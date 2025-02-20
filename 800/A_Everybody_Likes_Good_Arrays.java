import java.util.*;

@SuppressWarnings("unused")
public class A_Everybody_Likes_Good_Arrays {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Everybody_Likes_Good_Arrays
            int n = s.nextInt();
            long arr [] = new long [n];
            for(int j=0;j<n;j++){
                arr[j] = s.nextLong();
            }
            // long count = arr[0];
            int cnt = 0;
            // ArrayList <Long> ans = new ArrayList<>();
            for(int j = 1;j<n;j++){
                if(arr[j-1]%2 == arr[j]%2){
                    // count *= arr[j];
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
        s.close();
    }
}
