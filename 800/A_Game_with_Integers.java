import java.util.*;

@SuppressWarnings("unused")
public class A_Game_with_Integers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            if(n%3==0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
        s.close();
    }
}
