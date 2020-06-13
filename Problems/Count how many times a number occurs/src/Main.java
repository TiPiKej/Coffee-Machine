import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }

        final int n = scanner.nextInt();
        int count = 0;

        for(int nbr : arr){
            if(nbr == n){
                count++;
            }
        }

        System.out.println(count);

        scanner.close();
    }
}