import java.util.*;

@SuppressWarnings("unused")
public class B_Blank_Space {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr [] = new int [n];
            for(int j = 0;j<n;j++){
                arr[j] = s.nextInt();
            }
            int count = 0;
            if(arr[0]==0){
                count = 1;
            }
            int maxlen = count;
            for(int j = 1;j<n;j++){
                if(arr[j]==arr[j-1] && arr[j]==0){
                    count++;
                }
                if(arr[j]!=arr[j-1] && arr[j]==0){
                    count = 1;
                }
                maxlen = Math.max(maxlen, count);
            }
            System.out.println(maxlen);
        }
        s.close();
    }
}
