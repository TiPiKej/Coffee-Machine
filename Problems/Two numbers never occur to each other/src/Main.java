import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int length = scanner.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = scanner.nextInt();
        }

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        boolean is = true;
        for(int i = 0; i < length-1; i++){
            if(arr[i] == a && arr[i+1] == b || arr[i] == b && arr[i+1] == a){
                is = false;
            }
        }

        System.out.println(is);

        scanner.close();
    }
}