import java.util.*;

@SuppressWarnings("unused")
public class A_Grasshopper_on_a_Line {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int x = s.nextInt();
            int k = s.nextInt();
            if(x%k==0){
                System.out.println(2);
                System.out.print(x-1 + " " + 1);
                System.out.println();
            }else{
                System.out.println(1);
                System.out.println(x);
            }
        }
        s.close();
    }
}
