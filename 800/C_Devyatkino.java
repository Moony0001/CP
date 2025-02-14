import java.util.*;
@SuppressWarnings("unused")
public class C_Devyatkino {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=0;i<n;i++){
            int a = s.nextInt();
            int low = Integer.MAX_VALUE;
            int temp = a;
            int ones = temp%10;
            temp = temp/10;
            int closest = -1;
            while(temp!=0){
                int digit = temp%10;
                if(digit<=7 && digit>closest){
                    closest = digit;
                }
                temp=temp/10;
            }
            int cmp1 = (7-closest);
            int cmp2 = 3+ones;
        }
        s.close();
    }
}
