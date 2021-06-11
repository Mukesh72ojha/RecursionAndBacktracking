import java.util.ArrayList;
import java.util.Scanner;

public class GetSub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
       ArrayList<String> result = getSS(str);
       System.out.println(result);
    }
    public static ArrayList<String> getSS(String str){
        if (str.length() <= 0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        char ch = str.charAt(0);
        String str1 = str.substring(1);
        ArrayList<String> ror = getSS(str1);
        ArrayList<String> myResult = new ArrayList<>();
        for (String temp : ror){
            myResult.add(""+temp);
            myResult.add(ch + temp);
        }
        return myResult;
    }
}
