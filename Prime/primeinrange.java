package Prime;
import java.util.*;
public class primeinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();
        for(int i=l;i<=h;i++){
            int count=0;
            //try to divide i and increment n
            for (int div=2;div*div<=i;div++){  
                if(i%div==0)
                    count++;
                    break;
                }
                if(count==0)
                    System.out.println(i);                                       
        }
        sc.close();
    }
}
