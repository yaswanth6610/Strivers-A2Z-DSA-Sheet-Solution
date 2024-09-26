package step1.lec1;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        System.out.println(comapreMarks(s1, s2));

        
        sc.close();
    }


    public static String comapreMarks(int s1, int s2){
        if(s1>s2){
            return "Student1 got more marks than student2";
        }
        else if(s1<s2){
            return "student1 got less marks than student2";
        }
        else{
        return "both are equal scored";
        }
    }
}
