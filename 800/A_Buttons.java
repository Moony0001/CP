import java.util.*;

@SuppressWarnings("unused")
public class A_Buttons {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if(c%2==0){
                a+=c/2;
                b+=c/2;
            }else{
                a+=(c+1)/2;
                b+=(c-1)/2;
            }
            if(a>b){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
        s.close();
    }
}
