import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var word1 = scanner.next();
        var word2 = scanner.next();
        var word3 = scanner.next();

        System.out.println(word3 + "\n" + word2 + "\n" + word1);
    }
}