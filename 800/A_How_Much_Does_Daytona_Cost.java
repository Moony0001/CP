import java.util.*;

@SuppressWarnings("unused")
public class A_How_Much_Does_Daytona_Cost {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int len = s.nextInt();
            int comm = s.nextInt();
            int arr [] = new int [len];
            for(int j=0;j<len;j++){
                arr[j] = s.nextInt();
            }
            Arrays.sort(arr);
            if(Arrays.binarySearch(arr, comm)>=0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}
