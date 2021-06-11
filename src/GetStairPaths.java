import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> res = getStairPath(n);
        System.out.println(res);
    }
    public static ArrayList<String> getStairPath(int n){
        if ( n== 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }else if (n < 0){
            return new ArrayList<>();
        }
        ArrayList<String> path1 = getStairPath(n -1);
        ArrayList<String> path2 = getStairPath(n - 2);
        ArrayList<String> path3 = getStairPath(n - 3);
        ArrayList<String> myPaths = new ArrayList<>();
        for (String paths : path1){
            myPaths.add(1 + paths);
        }
        for (String paths : path2){
            myPaths.add(2 + paths);
        }
        for (String paths : path3){
            myPaths.add(3 + paths);
        }
        return myPaths;
    }
}
