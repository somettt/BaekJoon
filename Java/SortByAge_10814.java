import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortByAge_10814 {
    public static void main(String[] args)throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        class Person implements Comparable<Person>{         /// 편의상 객체
            int num;
            int age;
            String name;

            public Person(int num, int age, String name) {
                this.num = num;
                this.age = age;
                this.name = name;
            }

            @Override
            public int compareTo(Person p) {
                int c = Integer.compare(this.age,p.age);
                if(c!=0) return c;
                return Integer.compare(this.num,p.num);
            }
        }

        List<Person> persons = new ArrayList<Person>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = i;
            int age = sc.nextInt();
            String name = sc.nextLine();
            persons.add(new Person(num,age,name));
        }

        Collections.sort(persons);

        for (Person p : persons) {
            System.out.println(p.age+p.name);
        }

    }
}
