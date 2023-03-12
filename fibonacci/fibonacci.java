package fibonacci;
import java.util.*;;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<t;i++){
            int c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
        sc.close();
    }
}
