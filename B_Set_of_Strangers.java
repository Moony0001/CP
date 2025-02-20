import java.util.*;

@SuppressWarnings("unused")
public class B_Set_of_Strangers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //B_Set_of_Strangers
            int n = s.nextInt();
            int m = s.nextInt();
            int arr [][] = new int [n][m];
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    arr[j][k] = s.nextInt();
                }
            }
            
        }
        s.close();
    }
}
