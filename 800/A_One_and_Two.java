import java.util.*;

@SuppressWarnings("unused")
public class A_One_and_Two {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_One_and_Two
            int n = s.nextInt();
            int arr [] = new int [n];
            for(int j=0;j<n;j++){
                arr[j] = s.nextInt();
            }
            int pre [] = new int [n];
            int total = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==2){
                    total++;
                }
                pre[j] = total;
            }
            if(total%2!=0){
                System.out.println(-1);
            }else{
                int ans = 0;
                while(pre[ans]!=total/2){
                    ans++;
                }
                System.out.println(ans+1);
            }
        }
        s.close();
    }
}
