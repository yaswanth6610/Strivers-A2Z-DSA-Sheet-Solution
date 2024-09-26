package step1.lec1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  name = sc.next();
        char intial = name.charAt(0);
        int age = sc.nextInt();
        float marks = sc.nextFloat();


        System.out.println(name);
        System.out.println(intial);
        System.out.println(age);
        System.out.println(marks);

        sc.close();
    }
}
