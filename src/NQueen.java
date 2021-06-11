import java.util.Scanner;

public class NQueen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        printNQueen(arr,"",0);
    }
    public static void printNQueen(int[][] arr,String ans,int row){
        if (row == arr.length){
            System.out.println(ans + ".");
            return;
        }
        for (int column = 0;column < arr.length;column++){
            if (isItSafe(arr, row, column)){
                arr[row][column] = 1;
                printNQueen(arr,ans + row + "-" + column + ",",row + 1);
                arr[row][column] = 0;
            }
        }
    }
    public static boolean isItSafe(int [][] arr1,int row,int col){
        for (int i = row - 1; i>=0; i--){
            if (arr1[i][col] == 1){
                return false;
            }
        }
        for (int i = row - 1,j = col - 1;i >= 0 && j >= 0;i--,j--){
            if (arr1[i][j] == 1){
                return false;
            }
        }
        for (int i = row - 1,j = col + 1;i >= 0 && j < arr1.length;i--,j++){
            if (arr1[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
