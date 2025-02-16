import java.util.*;

@SuppressWarnings("unused")
public class A_Brogramming_Contest {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(int i=0;i<t;i++){
            int  n = s.nextInt();
            String st = s.next();
            StringBuilder sbs = new StringBuilder(st);
            StringBuilder sbt = new StringBuilder();
            boolean p1 = true;
            boolean p2 = false;
            int moves = 0;
            int idx1 = 0;
            int idx2 = 0;
            
            while(p1 || p2){
                if(p1){
                    idx1 = sbs.lastIndexOf("01");                    
                    // System.out.println("idx1 "+idx1);
                    if(idx1 != -1 || (idx1==-1 && !sbs.isEmpty() && sbs.charAt(0)=='1')){
                        idx1++;
                        // System.out.println("idx1 after increment "+idx1);

                        sbt.append(sbs.substring(idx1));
                        sbs.delete(idx1, sbs.length());
                        moves++;
                    }
                    // System.out.println("sbs " + sbs.toString());
                    // System.out.println("sbt " + sbt.toString());
                    p1 = false;
                    p2 = true;
                }
                if(p2){
                    idx2 = sbt.lastIndexOf("10");
                    // System.out.println("idx2 "+idx2);
                    if(idx2!=-1 || (idx2==-1 && !sbt.isEmpty() && sbt.charAt(0)=='0')){
                        idx2++;
                        // System.out.println("idx2 after increment "+idx1);

                        sbs.append(sbt.substring(idx2));
                        sbt.delete(idx2, sbt.length());
                        moves++;
                    }
                    // System.out.println("sbs " + sbs.toString());
                    // System.out.println("sbt " + sbt.toString());
                    p1 = true;
                    p2 = false;
                }
                if(idx1 == -1 && idx2 == -1){
                    break;
                }
            }
            System.out.println(moves);

        }
        s.close();
    }

}
