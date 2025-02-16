import java.util.*;

@SuppressWarnings("unused")
public class A_Desorting {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int len = s.nextInt();
            int arr [] = new int [len];
            for(int j = 0;j<len;j++){
                arr[j] = s.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int j = 1;j<len;j++){
                min = Math.min(min,(arr[j]-arr[j-1]));
            }
            int ans = 0;
            if(min>-1){
                ans = (min/2)+1;
            }
            System.out.println(ans);
        }
        s.close();
    }
}
