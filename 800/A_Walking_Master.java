import java.util.*;

@SuppressWarnings("unused")
public class A_Walking_Master {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            long a = s.nextLong();
            long b = s.nextLong();
            long c = s.nextLong();
            long d = s.nextLong();
            if(b>d){
                System.out.println(-1);
                continue;
            }
            long diff = d-b;
            a+=diff;
            long moves = diff;
            if(a<c){
                System.out.println(-1);
            }else{
                long temp = a-c;
                moves+=temp;
                System.out.println(moves);
            }

        }
        s.close();
    }
}
