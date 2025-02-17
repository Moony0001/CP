import java.util.*;

@SuppressWarnings("unused")
public class A_We_Need_the_Zero {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr [] = new int [n];
            for(int j=0;j<n;j++){
                arr[j] = s.nextInt();
            }
            int xor = 0;
            for(int j = 0;j<n;j++){
                xor = xor^arr[j];
            }
            if(n%2==0){
                if(xor==0){
                    System.out.println(xor);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(xor);
            }
        }
        s.close();
    }
}
