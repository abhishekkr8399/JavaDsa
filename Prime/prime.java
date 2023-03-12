package Prime;
import java.util.*;;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
        int count=0;
        for (int div=2;div*div<=n;div++){       //every one is divisible by 1
            if(n%div==0)
                count++;                        // if count increase means there is a third no.
                break;                         //no need to check further
        }
        if(count==0)
            System.out.println("Prime");
        else    
            System.out.println("Not-Prime");

        }
        sc.close();
    }
}
