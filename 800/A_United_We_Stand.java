import java.util.*;

@SuppressWarnings("unused")
public class A_United_We_Stand {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int lena = s.nextInt();
            int arra [] = new int [lena];
            for(int j = 0;j<lena;j++){
                arra[j] = s.nextInt();
            }
            Arrays.sort(arra);
            if(arra[0]==arra[lena-1]){
                System.out.println(-1);
                continue;
            }
            ArrayList<Integer> arrb = new ArrayList<>();
            ArrayList<Integer> arrc = new ArrayList<>();
            arrb.add(arra[0]);
            for(int j=1;j<lena;j++){
                if(arra[j]==arra[0]){
                    arrb.add(arra[j]);
                }else{
                    arrc.add(arra[j]);
                }
            }
            System.out.println(arrb.size() + " " + arrc.size());
            for(int j = 0;j<arrb.size();j++){
                System.out.print(arrb.get(j) + " ");
            }
            System.out.println();
            for(int j = 0;j<arrc.size();j++){
                System.out.print(arrc.get(j) + " ");
            }
            System.out.println();

        }
        s.close();
    }
}
