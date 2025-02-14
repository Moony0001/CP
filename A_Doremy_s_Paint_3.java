import java.util.*;

@SuppressWarnings("unused")
public class A_Doremy_s_Paint_3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr [] = new int [n];
            for(int j = 0;j<n;j++){
                arr[j] = s.nextInt();
            }
            if(n<3){
                System.out.println("Yes");
            }else{
                Arrays.sort(arr);
                if(arr[0]==arr[n-1]){
                    System.out.println("Yes");
                }else {
                    int count = 1;
                    for(int j = 1;j<n;j++){
                        if(arr[j]!=arr[j-1]){
                            count++;
                        }
                        if(count>2){
                            break;
                        }
                    }
                    if(count > 2){
                        System.out.println("No");
                    }else{
                        int cnt1 = 0;
                        int cnt2 = 0;
                        for(int j =0;j<n;j++){
                            if(arr[j]==arr[0]){
                                cnt1++;
                            }else{
                                cnt2++;
                            }
                        }
                        if(Math.abs(cnt2-cnt1)<2){
                            System.out.println("Yes");
                        }else{
                            System.out.println("No");
                        }
                    }
                }
            }
        }
        s.close();
    }
}
