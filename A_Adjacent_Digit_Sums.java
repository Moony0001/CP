import java.util.*;

public class A_Adjacent_Digit_Sums {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            if(((y-x)==1) || (((x-y)%9)==8) || (x%9==0 && y==1)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        s.close();
    }
}
