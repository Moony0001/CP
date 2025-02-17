import java.util.*;

@SuppressWarnings("unused")
public class A_Unit_Array {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr [] = new int [n];
            for(int j = 0;j<n;j++){
                arr[j] = s.nextInt();
            }
            int countp = 0;
            int countn = 0;
            for(int j = 0;j<n;j++){
                if(arr[j]<0){
                    countn++;
                }else{
                    countp++;
                }
            }
            int count = 0;
            if(countn > n/2){
                int change = countn - n/2;
                count+=change;
                countn-=change;
                countp+=change;
            }
            if(countn%2!=0){
                count++;
            }
            System.out.println(count);
        }
        s.close();
    }
}
