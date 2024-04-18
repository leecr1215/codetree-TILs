import java.util.*;

public class Main {
    public static class Person {
        int age;
        String gender;

        public Person(int age, String gender){
            this.age = age;
            this.gender = gender;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person(sc.nextInt(), sc.next());
        Person person2 = new Person(sc.nextInt(), sc.next());

        if((person1.age >= 19 && person1.gender.equals("M")) || (person2.age >= 19 && person2.gender.equals("M"))){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        
    }
}