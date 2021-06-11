import java.util.ArrayList;
import java.util.Scanner;

public class aniseHi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = left; i <= right;i++){
            int num = isPrime(i);
            if (num != 0){
                arr.add(num);
            }
        }
        int res = arr.get(arr.size() - 1) - arr.get(0);
        System.out.println(res);
        for (int a : arr){
            System.out.println(a);
        }
    }
    public static int isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i != 0) {
                return n;
            }
        }
        return 0;
    }
}
