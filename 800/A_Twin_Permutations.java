import java.util.*;

@SuppressWarnings("unused")
public class A_Twin_Permutations {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr [] = new int[n];
            for(int j = 0;j<n;j++){
                arr[j] = s.nextInt();
            }
            int diff = n+1;
            int ans [] = new int [n];
            for(int j = 0;j<n;j++){
                ans[j] = diff-arr[j];
            }
            for(int j = 0;j<n;j++){
                System.out.print(ans[j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
