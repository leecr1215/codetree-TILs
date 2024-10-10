import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static class Rudolph {
		int x; // 현재 x
		int y; // 현재 y
		int d; // 이전에 이동한 방향

		public Rudolph(int x, int y, int d) {
			this.x = x;
			this.y = y;
			this.d = d;
		}

	}

	public static class Point {
		int santaNum;
		int point;

		public Point(int santaNum, int point) {
			this.santaNum = santaNum;
			this.point = point;
		}

	}

	public static class Santa implements Comparable<Santa> {
		int num; // 산타 번호
		int x;
		int y;
		int d;
		int faintingTurn; // -1이면 기절 X 상태
		int point; // 산타 획득 점수
		boolean isDead; // 탈락한 산타

		public Santa(int num, int x, int y, int d, int faintingTurn, int point, boolean isDead) {
			this.num = num;
			this.x = x;
			this.y = y;
			this.d = d;
			this.faintingTurn = faintingTurn;
			this.point = point;
			this.isDead = isDead;
		}

		@Override
		public int compareTo(Santa o) {
			return this.num - o.num;
		}

		@Override
		public String toString() {
			return this.num + "";
		}

	}

	static Rudolph rudolph;
	static LinkedList<Santa> santas;
	static int N, C, D;
	static LinkedList<Point> points = new LinkedList<>(); // 제거된 산타들의 포인트들도 저장

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken()); // 게임판의 크기
		int M = Integer.parseInt(st.nextToken()); // 게임 턴 수
		int P = Integer.parseInt(st.nextToken()); // 산타의 수
		C = Integer.parseInt(st.nextToken()); // 루돌프의 힘
		D = Integer.parseInt(st.nextToken()); // 산타의 힘

		st = new StringTokenizer(br.readLine());
		int Rr = Integer.parseInt(st.nextToken()); // 초기 루돌프 위치
		int Rc = Integer.parseInt(st.nextToken()); // 초기 루돌프 위치

		rudolph = new Rudolph(Rr, Rc, -1);

		santas = new LinkedList<>();

		for (int i = 0; i < P; i++) {
			st = new StringTokenizer(br.readLine());

			santas.add(new Santa(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()), -1, -1, 0, false));
		}

		Collections.sort(santas);

		for (int i = 0; i < M; i++) {
			//System.out.printf("=======%d 번째 턴=========\n", i + 1);

			//0. 현재가 기절턴 + 2인 산타들 풀어주기
			for(Santa santa : santas) {
				if(santa.faintingTurn!=-1 && santa.faintingTurn + 2 == i) {
					santa.faintingTurn = -1;
				}
			}
			
			
			// 1. 루돌프 이동
			moveRudolph();

			// 1-1. 루돌프 이동 후 충돌 확인
			ruDolphCrush(i);

			// 종료조건 : 산타가 다 탈락한 경우
			if (isAllSantaDead())
				break;

			// 2. 산타 이동
			moveSanta(i);
			

			// 종료조건 : 산타가 다 탈락한 경우
			if (isAllSantaDead())
				break;

			// 턴이 제대로 종료했다면, 살아있는 산타들한테 1점씩 주기
			for (Santa santa : santas) {
				if(!santa.isDead) {
					santa.point += 1;
				}
			}
		}


		// 모든 산타의 점수 출력
		for (Santa santa : santas) {
			System.out.print(santa.point + " ");
		}

	}

	// 상우하좌 왼위 왼아래 오위 오아래
	static int[] dx = { -1, 0, 1, 0, -1, 1, -1, 1 };
	static int[] dy = { 0, 1, 0, -1, -1, -1, 1, 1 };
	
	/**
	 * 
	 * @return
	 */
	public static boolean isAllSantaDead() {
		int cnt = 0; // 살아있는 산타 수 세기
		for(Santa santa : santas) {
			if(!santa.isDead) cnt++;
		}
		
		if(cnt == 0) return true;
		return false;
	}

	/**
	 * 루돌프 이동
	 */
	static void moveRudolph() {
		int minLen = Integer.MAX_VALUE;
		int maxR = 0; // 가장 가까운 산타의 R
		int maxC = 0; // 가장 가까운 산타의 C

		// 1. 가장 가까운 산타 선택
		for (Santa santa : santas) {
			
			// 탈락한 산타는 패스!
			if(santa.isDead) continue;
			
			int len = (int) (Math.pow(santa.x - rudolph.x, 2) + Math.pow(santa.y - rudolph.y, 2));

			//System.out.println(santa.num + "번 산타와 루돌프 사이의 거리 : " + len);

			if (len < minLen) {
				minLen = len;
				maxR = santa.x;
				maxC = santa.y;
			} else if (len == minLen) {
				if (maxR < santa.x) {
					minLen = len;
					maxR = santa.x;
					maxC = santa.y;
				} else if (maxR == santa.x) {
					if (maxC < santa.y) {
						minLen = len;
						maxR = santa.x;
						maxC = santa.y;
					}
				}
			}
		}

		//System.out.printf("(%d, %d) 위치에 있는 산타 쪽으로 이동\n", maxR, maxC);

		if(minLen == Integer.MAX_VALUE) return;
		
		// 2. 인접 8방향 중 가까운 산타를 향해 돌진
		minLen = Integer.MAX_VALUE;
		int nextRudolphX = rudolph.x;
		int nextRudolphY = rudolph.y;
		int d = rudolph.d;

		for (int i = 0; i < 8; i++) {
			int nx = rudolph.x + dx[i];
			int ny = rudolph.y + dy[i];

			int len = (int) (Math.pow(maxR - nx, 2) + Math.pow(maxC - ny, 2));

			if (nx > 0 && nx <= N && ny > 0 && ny <= N && len < minLen) {
				nextRudolphX = nx;
				nextRudolphY = ny;
				d = i;
				minLen = len;
			}
		}

		rudolph.x = nextRudolphX;
		rudolph.y = nextRudolphY;
		rudolph.d = d;

		//System.out.printf("이동한 후 루돌프 위치 : (%d, %d) \n", rudolph.x, rudolph.y);

	}

	/**
	 * 루돌프 이동 후 충돌
	 */
	static void ruDolphCrush(int curTurn) {
		for (Santa santa : santas) {
			
			// 탈락한 산타는 패스
			if(santa.isDead) continue;
			
			if (rudolph.x == santa.x && rudolph.y == santa.y) {
				// 충돌!!

				// 해당 산타는 점수 get
				santa.point += C;

				// 해당 산타는 루돌프의 이동 방향으로 C칸 밀림
				int nx = santa.x + C * dx[rudolph.d];
				int ny = santa.y + C * dy[rudolph.d];


				santa.x = nx;
				santa.y = ny;

				// 산타 기절
				santa.faintingTurn = curTurn;

				// 밀린 곳이 경계 밖이면 탈락
				if (nx <= 0 || nx > N || ny <= 0 || ny > N) {
					santa.isDead = true;
					return;
				} else {
					// 밀린 곳에 산타 있는지 확인
					checkSanta(santa, rudolph.d);
				}

			}
		}

	}

	/**
	 * 밀린 곳에 산타가 있는지 확인
	 * 
	 * @param santa
	 */
	static void checkSanta(Santa santa, int d) {
		
		for (Santa s : santas) {
			// 탈락한 산타는 패스
			if(s.isDead) continue;
			
			// 자기 자신은 패스
			if(s.num == santa.num) continue;
			
			// x랑 y가 같음
			if (s.x == santa.x && s.y == santa.y) {
				//System.out.println("밀렸는데 " + s.num +"번 산타가 거기 있음");
				
				// s가 d방향으로 한 칸 밀림
				int nx = s.x + dx[d];
				int ny = s.y + dy[d];
				
				s.x = nx;
				s.y = ny;

				// 밀린게 경계 밖이 면 산타에서 제거
				if (nx <= 0 || nx > N || ny <= 0 || ny > N) {
					s.isDead = true;

					return;
				} else {
					// 밀렸는데 거기 산타가 있다면?
					checkSanta(s, d);
				}

			}
		}
	}

	/**
	 * 산타 이동 기절하지 않은 산타만
	 */
	static void moveSanta(int curTurn) {
		for (Santa santa : santas) {

			// 기절한 산타는 이동 X
			if (santa.faintingTurn != -1)
				continue;
			
			// 탈락한 산타는 이동X
			if(santa.isDead) continue;

			int minLen = (int) (Math.pow(rudolph.x - santa.x, 2) + Math.pow(rudolph.y - santa.y, 2));
			int nextSantaX = santa.x;
			int nextSantaY = santa.y;
			int d = santa.d;

			for (int i = 0; i < 4; i++) {
				int nx = santa.x + dx[i];
				int ny = santa.y + dy[i];

				int len = (int) (Math.pow(rudolph.x - nx, 2) + Math.pow(rudolph.y - ny, 2));

				if (nx > 0 && nx <= N && ny > 0 && ny <= N && !otherSanta(nx, ny) && len < minLen) {
					minLen = len;
					nextSantaX = nx;
					nextSantaY = ny;
					d = i;
				}
			}

			
			santa.x = nextSantaX;
			santa.y = nextSantaY;
			santa.d = d;

			//System.out.println(santa.num + "번 산타 이동 완료!!!!!" + santa.x + ", " + santa.y);

			
			
			if (isAllSantaDead()) return;
			
			// 2-1. 산타 이동 후 루돌프와 충돌 확인
			santaCrush(curTurn, santa);

		}
	}

	/**
	 * nx, ny 자리에 다른 산타 있는지 확인
	 * 
	 * @param nx
	 * @param ny
	 * @return
	 */
	static boolean otherSanta(int nx, int ny) {

		for (Santa santa : santas) {
			
			// 탈락 산타 제외
			if(santa.isDead) continue;
			
			if (santa.x == nx && santa.y == ny) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 2-1. 산타 이동 후 루돌프와 충돌 확인
	 * 
	 * 
	 */
	static void santaCrush(int curTurn, Santa curSanta) {
		if (curSanta.x == rudolph.x && curSanta.y == rudolph.y) {
			//System.out.println(curSanta.num + "번  산타 충돌임!!");
			
			curSanta.point += D;

			// 해당 산타는 자신의 반대 방향으로 D칸 밀림
			int nx = curSanta.x;
			int ny = curSanta.y;
			int reverseD = reverseDirection(curSanta.d);

			
			nx = nx + D * dx[reverseD];
			ny = ny + D * dy[reverseD];
			

			curSanta.x = nx;
			curSanta.y = ny;

			// 산타 기절
			curSanta.faintingTurn = curTurn;

			//System.out.println("충돌한 " + curSanta.num + "번 산타는 (" + curSanta.x + ", " + curSanta.y + ") 로 이동");

			// 밀린 곳이 경계 밖이면 제거
			if (nx <= 0 || nx > N || ny <= 0 || ny > N) {
				//System.out.println(curSanta.num + "번 산타 제거!!!!!!");
				
				curSanta.isDead = true;
				return;
			} else {
				// 밀린 곳에 산타 있는지 확인
				checkSanta(curSanta, reverseD);
			}

		}
		
	}

	/**
	 * 산타의 방향에서만 적용됨 d는 0이상 3이하
	 * 
	 * @param d
	 * @return d의 반대 방향 return
	 */
	static int reverseDirection(int d) {
		return (d + 2) % 4;
	}

}