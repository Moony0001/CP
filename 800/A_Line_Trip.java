import java.util.*;

@SuppressWarnings("unused")
public class A_Line_Trip {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int dest = s.nextInt();
            int arr [] = new int [n+2];
            arr[0] = 0;
            for(int j=1;j<n+1;j++){
                arr[j] = s.nextInt();
            }
            arr[n+1] = dest;
            int ans = Integer.MIN_VALUE;
            for(int j=1;j<n+2;j++){
                if(j!=n+1){
                    ans = Math.max(arr[j]-arr[j-1], ans);
                }else{
                    ans = Math.max(2*(arr[j]-arr[j-1]), ans);
                }
            }
            System.out.println(ans);
        }
        s.close();
    }
}
