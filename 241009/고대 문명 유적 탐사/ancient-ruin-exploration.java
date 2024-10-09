import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n = 5;
	static int m = 5;
	static Queue<Integer> piece = new ArrayDeque<>();
	static int[][] arr = new int[n][n];


	public static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			piece.add(Integer.parseInt(st.nextToken()));
		}

		for (int t = 0; t < K; t++) {
			
			// [1] 탐사 진행
			exploration();

			// 유물이 없는 경우 턴 즉시 종료
			if (maxValue == 0) {
				break;
			} 
			
			// [2] 연쇄 획득
			int cnt = getAntiquity();
			
			System.out.print(cnt + " ");
		}
		
		

	}

	static boolean[][] visited;
	static int[][] maxArr;
	static int maxValue;
	static int[][] rotateArr;

	public static void exploration() {
		// 회전의 방법들 결과 저장
		maxValue = 0;
		maxArr = new int[5][5];
		
		// 회전수 -> 열 -> 행 (우선순위 작은 순)
		for(int r = 1; r <= 3; r++) { 
			for(int j = 0; j < 3; j++) {
				for(int i = 0; i < 3; i++) {
					
					rotateArr = new int[5][5];
					for (int k = 0; k < 5; k++) {
						rotateArr[k] = arr[k].clone();
					}
					
					// 각도 만큼 90도 시계방향 회전
					for(int rr = 0; rr < r; rr++) {
						rotateArr = rotate(rotateArr, i, j);
					}
					
					// 유물 개수 세기 (1차)
					// 여기서는 clear 안하겠다!
					int cnt = count_clear(rotateArr, 0);
					
					// 최대 개수
					if(maxValue < cnt) {
						maxValue = cnt;
						maxArr = rotateArr;
					}
					
				}
			}
		}
		
	}
	
	// 유물 연쇄 획득
	public static int getAntiquity() {
		int cnt = 0;
		arr = maxArr;
//		System.out.println(arr.toString());
//		printArr(arr);
		
		while(true) {
			// 얘는 비우는 행동 하기
			int temp = count_clear(arr, 1);
			
//			printArr(arr);
			
			if(temp == 0) { // 연쇄 획득 종료. 다음 턴으로 넘어감
				break;
			}
			
			cnt += temp; // 획득한 유물 개수 누적
			
			// 값 채우기
			for(int j = 0; j < 5; j++) {
				for(int i = 4; i >= 0; i--) {
					if(arr[i][j] == 0) {
						arr[i][j] = piece.poll();
					}
				}
			}
		}
		
		return cnt;
		
	}

	public static int[][] rotate(int[][] arr, int x, int y) {
		// 90도로 회전하는 코드
		
		// 배열 복사
		int[][] newArr = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			newArr[i] = arr[i].clone();
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				newArr[i+x][j+y] = arr[x+3-j-1][y+i];
			}
		}
		
		return newArr;
	}
	
	/**
	 * 
	 * @param arr
	 * @param isClear
	 * @return
	 */
	public static int count_clear(int[][] arr, int isClear) {
//		System.out.println(arr.toString());
		visited = new boolean[n][n];
		int cnt = 0;
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(!visited[i][j]) {
					cnt +=  bfs(arr, i, j, isClear);
				}
			}
		}
		
		
		return cnt;
	}
	

	// 상하좌우
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	
	/**
	 * 
	 * @param arr
	 * @param x
	 * @param y
	 * @param isClear  : 1인 경우 3개 이상의 값들이면 0으로 clear
	 * @return 3개 이상이면 값 리턴, 아니면 0리턴
	 */
	public static int bfs(int[][] arr, int x, int y, int isClear) {
		int cnt = 0; // 연결된 조각의 개수 세기

		Queue<Point> queue = new ArrayDeque<>();
		queue.add(new Point(x, y));
		visited[x][y] = true;
		cnt++;
		
		// 큐에 들어왔던 point들 저장
		LinkedList<Point> list = new LinkedList<>();
		list.add(new Point(x, y));

		while (!queue.isEmpty()) {
			Point point = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = point.x + dx[i];
				int ny = point.y + dy[i];

				if (arrayOutOfIndex(nx, ny))
					continue;
				if (visited[nx][ny])
					continue;
				if (arr[nx][ny] != arr[x][y])
					continue;

				queue.add(new Point(nx, ny));
				visited[nx][ny] = true;
				cnt++;
				list.add(new Point(nx, ny));
			}

		}
		
		if(cnt >= 3) {// 유물!
			if(isClear == 1) { // 큐에 있던 애들 0으로 변경하기
				for(Point p : list) {
					arr[p.x][p.y] = 0;
				}
			}
			
			return cnt;
		}
		

		return 0;

	}

	public static boolean arrayOutOfIndex(int nx, int ny) {
		return nx < 0 || nx >= 5 || ny < 0 || ny >= 5;
	}

	public static void printArr(int[][] arr) {
		System.out.println("배열 출력");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}