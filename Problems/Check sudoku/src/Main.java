import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();

        int[][] arr = new int[N * N][N * N];
        int[] temp = new int[N * N];
        boolean isSolved = true;

        for (int i = 0; i < N * N; i++) {
            for (int j = 0; j < N * N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N * N && isSolved; i++) {
            for (int j = 0; j < N * N && isSolved; j++) {
                if(arr[i][j] < 1 || arr[i][j] > N * N) isSolved = false; // check if contains correct numbers

                for (int k = j + 1; k < N * N && isSolved; k++) {       // check if each row has different nbrs
                    if(arr[i][j] == arr[i][k]) isSolved = false;
                }

                for (int k = i + 1; k < N * N && isSolved; k++) {       // check if each column has different nbrs
                    if(arr[i][j] == arr[k][j]) isSolved = false;
                }

                if (i % N == 0 && j % N == 0) {
                    int tempIndex = 0;
                    for (int k = i; k < i + N; k++) {
                        for (int l = j; l < j + N; l++) {
                            temp[tempIndex++] = arr[k][l];
                        }
                    }

                    for (int k = 0; k < tempIndex; k++) {               // check each square
                        for (int l = k + 1; l < temp.length; l++) {
                            if(temp[k] == temp[l]) isSolved = false;
                        }
                    }
                    Arrays.fill(temp, 0);
                }
            }
        }

        System.out.println(isSolved? "YES" : "NO");
    }
}