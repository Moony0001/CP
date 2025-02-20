import java.util.*;

@SuppressWarnings("unused")
public class A_Make_it_Beautiful {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Make_it_Beautiful
            int n = s.nextInt();
            int arr [] = new int[n];
            for(int j =0;j<n;j++){
                arr[j] = s.nextInt();
            }
            Arrays.sort(arr);
            if(arr[n-1]==arr[0]){
                System.out.println("NO");
                continue;
            }
            if(arr[n-1] == arr[n-2]){
                int temp = arr[0];
                arr[0]=arr[n-2];
                arr[n-2]=temp;
            }
            System.out.println("YES");
            for(int j = n-1;j>-1;j--){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
