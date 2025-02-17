import java.util.*;

@SuppressWarnings("unused")
public class C_Prepend_and_Append {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            String st = s.next();
            int a = 0;
            int b = st.length()-1;
            while(a<b){
                if(st.charAt(a)!=st.charAt(b)){
                    a++; 
                    b--;
                }else{
                    break;
                }
            }
            int len = b-a+1;
            System.out.println(len);
        }
        s.close();
    }
}
