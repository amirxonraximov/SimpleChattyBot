import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        var counter = 0;
//        if (a != n && b != n) {
//            for (int i = 0; i < n ; i++)
//                System.out.println(i);
//           }
//        else {
//            System.out.println(2);
//        }
        for (int i = a; i <= b; i++) {
            if (i % n == 0) counter++;
        }

        System.out.println(counter);
    }
}