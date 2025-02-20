import java.util.*;

@SuppressWarnings("unused")
public class A_Subtraction_Game {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Subtraction_Game
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);
        }
        s.close();
    }
}
