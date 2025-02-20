import java.util.*;

@SuppressWarnings("unused")
public class A_Maximise_The_Score {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Maximise_The_Score
            int n = s.nextInt();
            int arr [] = new int [2*n];
            for(int j = 0;j<2*n;j++){
                arr[j] =s.nextInt();
            }
            Arrays.sort(arr);
            long score = 0;
            for(int j = arr.length-2;j>-1;j=j-2){
                score+=arr[j];
            }
            System.out.println(score);
        }
        s.close();
    }
}
