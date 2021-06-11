import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPer(str,"");
    }
    public static void printPer(String str, String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            String LeftPart = str.substring(0,i);
            String RightPart = str.substring(i+1);
            String ros = LeftPart + RightPart;
            printPer(ros,ans + ch);
        }
    }
}
