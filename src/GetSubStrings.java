import java.util.Scanner;

public class GetSubStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getSubString(str);
    }
    public static void getSubString(String str){
        for (int i = 0;i<=str.length() -1;i++){
            for (int j = i+1;j<=str.length();j++){
                String SS = str.substring(i,j);
                System.out.println(SS);
            }
        }
    }
}
