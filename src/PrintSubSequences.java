import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubSequences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.next();
        }
        printSS(str,"",arr);
    }
    public static void printSS(String str, String ans, String[] arr){
        if (str.length() == 0){
            ArrayList<String> ar = new ArrayList<>();
            ar.add(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
         printSS(ros,ans + ch,arr);
         printSS(ros,ans,arr);
    }
}

