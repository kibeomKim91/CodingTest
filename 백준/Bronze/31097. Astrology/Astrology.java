import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        int month = Integer.parseInt(str[1]);
        int date = Integer.parseInt(str[2]);
        
        if((month == 3 && date >= 21) || (month == 4 && date <= 19)) {
            System.out.print("Aries");
        } else if((month == 4 && date >= 20) || (month == 5 && date <= 20)) {
            System.out.print("Taurus");
        } else if((month == 5 && date >= 21) || (month == 6 && date <= 20)) {
            System.out.print("Gemini");
        } else if((month == 6 && date >= 21) || (month == 7 && date <= 22)) {
            System.out.print("Cancer");
        } else if((month == 7 && date >= 23) || (month == 8 && date <= 22)) {
            System.out.print("Leo");
        } else if((month == 8 && date >= 23) || (month == 9 && date <= 22)) {
            System.out.print("Virgo");
        } else if((month == 9 && date >= 23) || (month == 10 && date <= 22)) {
            System.out.print("Libra");
        } else if((month == 10 && date >= 23) || (month == 11 && date <= 22)) {
            System.out.print("Scorpio");
        } else if((month == 11 && date >= 23) || (month == 12 && date <= 21)) {
            System.out.print("Sagittarius");
        } else if((month == 12 && date >= 22) || (month == 1 && date <= 19)) {
            System.out.print("Capricorn");
        } else if((month == 1 && date >= 20) || (month == 2 && date <= 18)) {
            System.out.print("Aquarius");
        } else if((month == 2 && date >= 19) || (month == 3 && date <= 20)) {
            System.out.print("Pisces");
        } 
    }
    
}