import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char color;
        boolean isMatrix = true;
        char[][] arr = new char[4][4];
        for(int i = 0, j; i < 4; i++){
            j = 0;
            for(char ch : scanner.nextLine().trim().toCharArray()){
                arr[i][j] = ch;
                j++;
            }
        }

        for (int i = 0; i < 3 && isMatrix; i++) {
            for (int j = 0; j < 3 && isMatrix; j++) {
                if(arr[i][j] != arr[i][j + 1]) continue;
                if(arr[i][j] != arr[i + 1][j]) continue;
                if(arr[i][j] != arr[i + 1][j + 1]) continue;
                isMatrix = false;
            }
        }

        System.out.println(isMatrix? "YES" : "NO");
    }
}