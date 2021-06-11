import java.util.Scanner;

public class PrintMazePathWithJumps {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        printMPWJ(1,1,row,column,"");
    }
    public static void printMPWJ(int sr,int sc,int dr,int dc,String paths){
        if (sr > dr || sc > dc){
            return;
        }
        if (sr == dr && sc == dc){
            System.out.println(paths);
            return;
        }
        for (int ms = 1;ms <= dc - sc;ms++){
            printMPWJ(sr,sc + ms,dr,dc,paths +"h" + ms);
        }
        for (int ms = 1;ms <= dr - sr;ms++){
            printMPWJ(sr + ms,sc,dr,dc,paths +"v" + ms);
        }
        for (int ms = 1;ms <= dc - sc && ms <= dr - sr;ms++){
            printMPWJ(sr + ms,sc + ms,dr,dc,paths +"d" + ms);
        }
    }
}
