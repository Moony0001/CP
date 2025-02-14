import java.util.*;

// @SuppressWarnings("unused")
public class A_Halloumi_Boxes{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int len = s.nextInt();
            int rev = s.nextInt();
            int arr [] = new int[len];
            for(int j=0;j<len;j++){
                arr[j] = s.nextInt();
            }
            //inputs

            if(rev>1){
                System.out.println("YES");
            }else{
                boolean flag = true;
                for(int j = 0;j<len-1;j++){
                    if(arr[j]>arr[j+1]){
                        flag = false;
                        break;
                    } 
                }
                if(flag){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }            
        }
        s.close();
    }
}
