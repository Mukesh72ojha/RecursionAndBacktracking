import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] arr = new int[size][size];
        int row = sc.nextInt();
        int col = sc.nextInt();
        printKnightTour(arr,row,col,1);
    }
    public static void printKnightTour(int [][] chess,int r,int c,int moves){
        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0){
            return;
        }else if (moves == chess.length * chess.length){
            chess[r][c] = moves;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = moves;
        printKnightTour(chess,r - 2,c + 1,moves + 1);
        printKnightTour(chess,r - 1,c + 2,moves + 1);
        printKnightTour(chess,r + 1,c + 2,moves + 1);
        printKnightTour(chess,r + 2,c + 1,moves + 1);
        printKnightTour(chess,r + 2,c - 1,moves + 1);
        printKnightTour(chess,r + 1,c - 2,moves + 1);
        printKnightTour(chess,r - 1,c - 2,moves + 1);
        printKnightTour(chess,r - 2,c - 1,moves + 1);
        chess[r][c] = 0;
    }
    public static void displayBoard(int [][] chess){
        for (int[] ints : chess) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
