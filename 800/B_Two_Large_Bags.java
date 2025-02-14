import java.util.*;

@SuppressWarnings("unused")
public class B_Two_Large_Bags{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        for(int i=0;i<n;i++){
            int len = s.nextInt();
            int arr [] = new int[len];
            for(int j = 0;j<len;j++){
                arr[j] = s.nextInt();
            }
            if(len==2 && arr[0]==arr[1]){
                System.out.println("Yes");
            }else if(len==2 && arr[0]!=arr[1]){
                System.out.println("No");
            }else{
                Arrays.sort(arr);
                int flen = arr[len-1]+1;
                int freq [] = new int [flen];
                for(int j=0;j<len;j++){
                    freq[arr[j]]++;
                }
                int thresh = arr[len-1]-arr[0];
                if((freq[arr[0]]-2>=thresh) || (freq[arr[0]]%2==0 && freq[arr[len-1]]%2==0)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
        s.close();
    }
}
