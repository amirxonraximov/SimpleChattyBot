import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, foodCost, flightCost, hotelCost;
        n = scanner.nextInt();
        foodCost = scanner.nextInt();
        flightCost = scanner.nextInt();
        hotelCost = scanner.nextInt();

        System.out.println(n * foodCost + 2 * flightCost + (n-1) * hotelCost);
    }
}