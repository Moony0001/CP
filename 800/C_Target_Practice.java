import java.util.*;

@SuppressWarnings("unused")
public class C_Target_Practice {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        for(int i=0;i<t;i++){
            int points = 0;
            String c [] = new String [10];
            for(int j = 0;j<10;j++){
                c[j] = s.nextLine();
            }

            for(int j = 0;j<10;j++){
                for(int k = 0;k<10;k++){
                    if(c[j].charAt(k)=='X'){
                        int xax = j+1;
                        int yax = k+1;
                        if(xax>5){
                            xax = 11-xax;
                        }
                        if(yax>5){
                            yax = 11-yax;
                        }
                        points += Math.min(xax,yax);
                    }
                }
            }
            System.out.println(points);
        }
        s.close();
    }
}
