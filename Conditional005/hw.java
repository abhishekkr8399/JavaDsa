package Conditional005;
import java.util.Scanner;
public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks:");
        int marks=sc.nextInt();
        if(marks>90)
            System.out.println("Excellent");
        else if(marks>80)
            System.out.println("Good");
        else if(marks>70)
            System.out.println("Fair");
        else if(marks>60)
            System.out.println("Meet Expections");
        else
            System.out.println("Below Par");
        sc.close();
        }
}
