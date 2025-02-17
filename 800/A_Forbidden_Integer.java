import java.util.*;

@SuppressWarnings("unused")
public class A_Forbidden_Integer {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int k = s.nextInt();
            int x = s.nextInt();
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int j = 0;j<n;j++){
                    System.out.print(1 + " ");
                }
                System.out.println();
            }else{
                if(k==1){
                    System.out.println("NO");
                    continue;
                }
                if(k==2){
                    if(n%2==0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int j = 0;j<n/2;j++){
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }else{
                        System.out.println("NO");
                    }
                }
                if(k>2){
                    if(n%2==0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int j = 0;j<n/2;j++){
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }else{
                        System.out.println("YES");
                        System.out.println(n/2);
                        int a = n/2 - 1;
                        for(int j = 0;j<a;j++){
                            System.out.print(2 + " ");
                        }
                        System.out.print(3);
                        System.out.println();
                    }
                }
            }
        }
        s.close();
    }
}
