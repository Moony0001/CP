import java.util.*;

@SuppressWarnings("unused")
public class A_Don_t_Try_to_Count {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int lenx = s.nextInt();
            int leny = s.nextInt();
            String x = s.next();
            String y = s.next();

            StringBuilder sb = new StringBuilder(x);
            if(sb.indexOf(y)!=-1){
                System.out.println(0);
                continue;
            }
            int count = 0;
            do {
                sb.append(sb);
                count++;
            } while (sb.length()<leny);

            if(sb.indexOf(y)==-1){
                sb.append(sb);
                count++;
                if(sb.indexOf(y)==-1){
                    System.out.println(-1);
                }else{
                    System.out.println(count);
                }
            }else{
                System.out.println(count);
            }

        }
        s.close();
    }
}
