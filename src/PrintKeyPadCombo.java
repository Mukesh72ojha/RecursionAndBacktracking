import java.util.Scanner;

public class PrintKeyPadCombo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str,"");
    }
    static String [] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String que, String ans){
        if (que.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = que.charAt(0);
        String ros = que.substring(1);
        String SofCodes = codes[ch - '0'];
        for (int i = 0;i<SofCodes.length();i++){
            char chOfCodes = SofCodes.charAt(i);
            printKPC(ros,ans + chOfCodes);
        }
    }
}