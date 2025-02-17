import java.util.*;

@SuppressWarnings("unused")
public class A_Coins {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            long n = s.nextLong();
            long k = s.nextLong();
            if(n%2==0){
                System.out.println("YES");
            }else{
                if(k%2!=0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        s.close();
    }
}
