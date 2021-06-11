import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printSumSubset(arr,0,"",0,tar);
    }
    public static void printSumSubset(int [] arr,int idx,String set, int sos,int tar){
        if (idx == arr.length){
            if (sos == tar){
                System.out.println(set);
            }
            return;
        }
        printSumSubset(arr,idx + 1,set + arr[idx] + ",",sos + arr[idx],tar);
        printSumSubset(arr,idx + 1,set,sos,tar);
    }
}
