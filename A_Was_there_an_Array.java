import java.util.*;

@SuppressWarnings("unused")
public class A_Was_there_an_Array {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Was_there_an_Array
            int n = s.nextInt();
            int arr [] = new int[n-2];
            for(int j =0;j<n-2;j++){
                arr[j]=s.nextInt();
            }
            int sz = arr.length;
            if(sz==1 || sz==2){
                System.out.println("YES");
                continue;
            }
            boolean flag = true;
            for(int j = 1;j<n-3;j++){
                if(arr[j-1]==1 && arr[j]==0 && arr[j+1]==1){
                    flag = false;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
        s.close();
    }
}
