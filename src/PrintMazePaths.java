import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        printMP(1,1,row,column,"");
    }
    public static void printMP(int sr,int sc,int dr, int dc,String path){
        if (sr > dr || sc > dc){
            return;
        }
        if (sr == dr && sc == dc){
            System.out.println(path);
            return;
        }
        printMP(sr + 1,sc,dr,dc,path + "v");
        printMP(sr,sc + 1,dr,dc,path + "h");
    }
}
