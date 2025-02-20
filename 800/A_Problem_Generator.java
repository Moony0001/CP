import java.util.*;

@SuppressWarnings("unused")
public class A_Problem_Generator {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            //A_Problem_Generator
            int n = s.nextInt();
            int m = s.nextInt();
            String st = s.next();
            int arr[] = new int [7];
            for(int j =0;j<n;j++){
                arr[st.charAt(j)-'A']++;
            }
            int count = 0;
            for(int j =0;j<7;j++){
                int temp = m-arr[j];
                if(temp>0){
                    count+=temp;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}
