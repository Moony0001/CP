import java.util.*;

@SuppressWarnings("unused")
public class A_Ambitious_Kid {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr [] = new int [t];
        for(int i=0;i<t;i++){
            arr[i] = s.nextInt();
        }
        int check = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<t;i++){
            min = Math.min(min, Math.abs(arr[i]-check));
        }
        System.out.println(min);
        s.close();
    }
}
