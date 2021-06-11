import java.util.ArrayList;
import java.util.Scanner;

public class MazePathJump {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        ArrayList<String> res = getMazePathJump(1,1,row,column);
        System.out.println(res);
    }
    public static ArrayList<String> getMazePathJump(int sr,int sc,int dr,int dc){
        if (sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myResult = new ArrayList<>();
        // for horizontal
        for(int h = 1;h <= dc - sc;h++){
            ArrayList<String> hpaths = getMazePathJump(sr,sc + h,dr,dc);
            for (String path : hpaths){
                myResult.add("h" + h + path);
            }
        }
        // for vertical
        for(int v = 1;v <= dr - sr;v++){
            ArrayList<String> vpaths = getMazePathJump(sr + v,sc,dr,dc);
            for (String path : vpaths){
                myResult.add("v" + v + path);
            }
        }
        // for diagonal
        for(int d = 1;d <= dc - sc && d <= dr - sr;d++){
            ArrayList<String> hpaths = getMazePathJump(sr + d,sc + d,dr,dc);
            for (String path : hpaths){
                myResult.add("d" + d + path);
            }
        }
        return myResult;
    }
}
