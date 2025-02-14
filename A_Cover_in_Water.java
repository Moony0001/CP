import java.util.*;

@SuppressWarnings("unused")
public class A_Cover_in_Water {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            String wat = s.next();
            int max = Integer.MIN_VALUE;
            int total = 0;
            int temp = 0;
            for(int j=0;j<n;j++){
                if(wat.charAt(j)=='.'){
                    total++;
                    temp++;
                    max = Math.max(max, temp);
                }
                if(wat.charAt(j)=='#'){
                    temp = 0;
                }
            }
            if(max>2){
                System.out.println(2);
            }else{
                System.out.println(total);
            }
        }
        s.close();
    }
}
