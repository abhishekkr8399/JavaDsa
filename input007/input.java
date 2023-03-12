package input007;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=Integer.parseInt(sc.nextLine());  //if both int and string is required
       String name=sc.nextLine();
       System.out.println("Dear "+name+".Here is your counting:");
       for(int i=1;i<n;i++){
            System.out.println(i);
        }
    sc.close();
    }
}
