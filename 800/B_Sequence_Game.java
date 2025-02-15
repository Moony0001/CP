import java.util.*;

@SuppressWarnings("unused")
public class B_Sequence_Game {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int j = 0;j<n;j++){
                arr.add(s.nextInt());
            }
            if(n == 1){
                System.out.println(1);
                System.out.println(arr.get(0));
                continue;
            }
            ans.add(arr.get(0));
            for(int j = 1;j<n;j++){
                if(arr.get(j)<arr.get(j-1)){
                    ans.add(arr.get(j));
                    ans.add(arr.get(j));
                }else{
                    ans.add(arr.get(j));
                }
            }
            System.out.println(ans.size());
            for(int j=0;j<ans.size();j++){
                System.out.print(ans.get(j) + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
