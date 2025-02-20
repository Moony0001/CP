import java.util.*;

@SuppressWarnings("unused")
public class A_Extremely_Round {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Extremely_Round
            int n = s.nextInt();
            int digits = 0;
            int lastd = 0;
            int temp = n;
            while(temp>0){
                digits++;
                if(temp>0 && temp<10){
                    lastd = temp;
                }
                temp = temp/10;
            }
            int count = 9*(digits-1)+lastd;
            System.out.println(count);
        }
        s.close();
    }
}
