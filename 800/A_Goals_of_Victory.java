import java.util.*;

@SuppressWarnings("unused")
public class A_Goals_of_Victory {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr [] = new int [n-1];
            for(int j=0;j<n-1;j++){
                arr[j] = s.nextInt();
            }
            int miss = 0;
            for(int j = 0;j<n-1;j++){
                miss += arr[j];
            }
            miss *=-1;
            System.out.println(miss);
        }
        s.close();
    }
}
