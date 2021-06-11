import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        ArrayList<String> res = getMazePath(1,1,row,column);
        System.out.println(res);
    }
    public static ArrayList<String> getMazePath(int sr,int sc,int dr,int dc){
        if (sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        if (sc < dc){
            hpath = getMazePath(sr,sc + 1,dr,dc);
        }
        if (sr < dr){
            vpath = getMazePath(sr + 1,sc,dr,dc);
        }
        ArrayList<String> myPaths = new ArrayList<>();
        for (String paths: hpath){
            myPaths.add("h" + paths);
        }
        for (String paths : vpath){
            myPaths.add("v" + paths);
        }
        return myPaths;
    }
}
