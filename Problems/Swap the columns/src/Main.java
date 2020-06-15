import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yLen = scanner.nextInt();
        int xLen = scanner.nextInt();
        int[][] arr = new int[yLen][xLen];

        for(int i = 0; i < yLen; i++){
            for(int j = 0; j < xLen; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp;

        for(int i = 0; i < yLen; i++){
            temp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = temp;
        }

        for(int i = 0; i < yLen; i++){
            for(int j = 0; j < xLen; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}