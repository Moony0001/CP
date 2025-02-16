import java.util.*;

@SuppressWarnings("unused")
public class A_Array_Coloring {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int len = s.nextInt();
            int arr [] = new int [len];
            for(int j = 0;j<len;j++){
                arr[j] = s.nextInt();
            }
            int odd = 0;
            int even = 0;
            for(int j=0;j<len;j++){
                if(arr[j]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(odd%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}
