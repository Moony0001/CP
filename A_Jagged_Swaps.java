import java.util.*;

@SuppressWarnings("unused")
public class A_Jagged_Swaps {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr[] = new int [n];
            for(int j = 0;j<n;j++){
                arr[j]=s.nextInt();
            }
            if(arr[0] == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}
