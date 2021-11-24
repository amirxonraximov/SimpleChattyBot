import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var firstname = scanner.next();
        var yearsOfExperience = scanner.next();
        var cuisinePreference = scanner.next();

        System.out.println("The form for " + firstname + " is completed. We will contact you if we need a chef who cooks " + cuisinePreference + " dishes and has " + yearsOfExperience + " years of experience.");


    }
}