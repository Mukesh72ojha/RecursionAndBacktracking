import java.util.Scanner;

public class PrintEncoding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printEncoding(str,"");
    }
    public static void printEncoding(String str,String ans){
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        else if (str.length()==1){
            char ch = str.charAt(0);
            if (ch == '0'){
                return;
            }else {
                int ch1 = ch - '0';
                char code = (char) ('a' + ch1 - 1);
                System.out.println(ans + code);
            }
        }
        else {
            char ch = str.charAt(0);
            String ros = str.substring(1);
            if (ch == '0'){
                return;
            }else {
                int n = ch - '0';
                char ch1 = (char) ('a' + n - 1);
                printEncoding(ros,ans + ch1);
            }
            String ch2 = str.substring(0,2);
            String roq = str.substring(2);
            int value = Integer.parseInt(ch2);
            if (value <= 26){
                char codes = (char) ('a' + value - 1);
                printEncoding(roq,ans+codes);
            }
        }
    }
}
