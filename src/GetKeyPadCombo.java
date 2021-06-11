import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyPadCombo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str){
        if (str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rros = getKPC(ros);
        ArrayList<String> myResult = new ArrayList<>();
        String str1 = codes[ch - '0'];
        for (int i = 0;i<str1.length();i++){
            char ch1 = str1.charAt(i);
            for (String temp : rros){
                myResult.add(ch1 + temp);
            }
        }
        return myResult;
    }
}
