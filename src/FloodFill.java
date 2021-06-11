import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int [] [] arr = new int[row][column];
        for (int i = 0;i < row;i++){
            for (int j = 0;j < column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean [][] visited = new boolean[row][column];
        floodFillPaths(arr,0,0,"",visited);
    }
    public static void floodFillPaths(int [][] arr1,int r,int c,String ans,boolean [][] visited){
        if (r < 0 || c < 0 || r == arr1.length || c == arr1[0].length || arr1[r][c] == 1 || visited[r][c]){
            return;
        }
        if (r == arr1.length - 1 && c == arr1[0].length - 1){
            System.out.println(ans);
            return;
        }
        visited[r][c] = true;
        floodFillPaths(arr1,r - 1,c,ans + "t",visited);
        floodFillPaths(arr1,r,c - 1,ans + "l",visited);
        floodFillPaths(arr1,r + 1,c,ans + "d",visited);
        floodFillPaths(arr1,r,c + 1,ans + "r",visited);
        visited[r][c] = false;
    }
}
