import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        if ((n / 1000 == n % 10) && ((n % 1000) / 10 == (n / 100))) {
//            System.out.println(1);
//        }
//        else {
//            System.out.println(0);
//        }
        if (n / 1_000 == n % 10 && (n % 1000) / 100 == (n % 100) / 10 ){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}