import java.util.*;

@SuppressWarnings("unused")
public class A_Sakurako_and_Kosuke {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Sakurako_and_Kosuke
            int n = s.nextInt();
            if(n%2==0){
                System.out.println("Sakurako");
            }else{
                System.out.println("Kosuke");

            }
        }
        s.close();
    }
}
