import java.util.*;

@SuppressWarnings("unused")
public class javatemplate {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //D_Palindrome_Shuffle
            String st = s.nextLine();
            if(st.length()<3){
                System.out.println(0);
            }
            int a = 0;
            int b = st.length()-1;
            int count = 0;
            int start = -1;
            HashMap <Character, Integer> mm = new HashMap<>();
            while(a<b){
                if(st.charAt(a)!=st.charAt(b)){
                    if(start==-1){
                        start = a;
                    }
                    if(!mm.containsKey(st.charAt(a))){
                        mm.put(st.charAt(a), 1);
                    }else{
                        int val = mm.get(st.charAt(a));
                        val++;
                        mm.put(st.charAt(a), val);
                    }
                }
                a++;
                b--;
            }
            int str = start;
            while(str<st.length()){
                if(mm.containsKey(st.charAt(str)))
            }
        }

        s.close();
    }
}
