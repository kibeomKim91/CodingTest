import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        sc.close();

        String exclamation = "??!";
        String surpriseUsername = username + exclamation;

        System.out.println(surpriseUsername);
    }
}