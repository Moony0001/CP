import java.util.*;

@SuppressWarnings("unused")
public class B_Variety_is_Discouraged {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int arr[]= new int [n];
            for(int j =0;j<n;j++){
                arr[j] = s.nextInt();
            }
            if(n==1){
                System.out.print(1);
                System.out.print(" ");
                System.out.print(1);
                continue;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j =0;j<n;j++){
                if(map.containsKey(arr[j])){
                    int temp = map.get(arr[j]);
                    temp++;
                    map.put(arr[j], temp);
                }else{
                    map.put(arr[j], 1);
                }
            }
            HashSet<Integer> set = new HashSet<>();
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()==1){
                    set.add(entry.getKey());
                }
            }
            int a = 0;
            int b = 0;
            HashMap<Integer,Integer> mapv = new HashMap<>();
            for(int j =0;j<n;j++){
                if(a==b && set.contains(arr[a])){
                    b++;
                }else if(a!=b && set.contains(arr[b])){
                    b++;
                }else if(a==b && !set.contains(arr[b])){
                    a++;
                    b++;
                }else if(a!=b && !set.contains(arr[b])){
                    int dist = b-a;
                    mapv.put(a,dist);
                    b++;
                    a=b;
                }
            }
            int max = Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry : mapv.entrySet()){
                
                max = Math.max(max, entry.getValue());
            }

        }
        s.close();
    }
}
