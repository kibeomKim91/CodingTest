import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        
        while(true) {
            String[] first = sc.next().split(":");
            String[] second = sc.next().split(":");
            
            if(first[0].equals("00") && first[1].equals("00") 
               && second[0].equals("00") && second[1].equals("00")) {
                break;
            }
            
            int firstHour = Integer.parseInt(first[0]);
            int firstMinute = Integer.parseInt(first[1]);
            int secondHour = Integer.parseInt(second[0]);
            int secondMinute = Integer.parseInt(second[1]);
            
            int sumHour = firstHour + secondHour;
            int sumMinute = firstMinute + secondMinute;
            int count = 0;
            
            if(sumMinute >= 60) {
                sumMinute -= 60;
                sumHour ++;
            }
            
            if(sumHour >= 24) {
                count += sumHour / 24;
                sumHour %= 24;
            }
            
            String resultHour = "";
            String resultMinute = "";
            
            if(sumHour >= 10) {
                resultHour += sumHour;
            } else {
                resultHour = "0" + sumHour;
            }
            
            if(sumMinute >= 10) {
                resultMinute += sumMinute;
            } else {
                resultMinute = "0" + sumMinute;
            }
            
            if(count == 0) {
                System.out.println(resultHour+":"+resultMinute);
            } else {
                System.out.println(resultHour+":"+resultMinute+" +"+count);
            }
        }
    }
    
}