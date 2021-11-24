import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ready = 0, fixed = 0, rejects = 0;

        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            if (temp == 1) {
                fixed++;
            } else if (temp == -1) {
                rejects++;
            } else {
                ready++;
            }
        }
        System.out.println(ready + " " + fixed + " " + rejects);
    }
}