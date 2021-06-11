import java.util.Scanner;
public class PrintStairPaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        getStairPaths(n,"");
    }
    public static void getStairPaths(int str,String ans){
        if (str == 0){
            System.out.println(ans);
            return;
        }
        if (str < 0){
            return;
        }
        getStairPaths(str - 1,ans + "1");
        getStairPaths(str - 2,ans + "2");
        getStairPaths(str - 3,ans + "3");
    }
}
