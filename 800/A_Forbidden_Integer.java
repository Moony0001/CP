import java.util.*;

@SuppressWarnings("unused")
public class A_Forbidden_Integer {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int k = s.nextInt();
            int x = s.nextInt();
            if(x==1 && k==1){
                System.out.println("NO");
                continue;
            }
            int max = k;
            while(max==x){
                max--;
            }
            int mul = n/max;
            int rem = n-(max*mul);
            if(rem!=x){
                System.out.println("YES");
                System.out.println(mul+1);
                for(int j =0;j<mul;j++){
                    System.out.print(max + " ");
                }
                System.out.print(rem);
                System.out.println();
            }else if(rem==x && x==1){
                rem+=max;
                mul--;
                if(rem%2!=0 && k>2){
                    int oddmul = rem/3;
                    int oddrem = rem - (3*oddmul);
                    System.out.println("YES");
                    System.out.println(mul+oddmul+);

                }else if (rem%2!=0 && k<3){
                    System.out.println("NO");
                    continue;
                }
            }

        }
        s.close();
    }
}
