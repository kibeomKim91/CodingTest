import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        String[] startTime = a.split(" : ");
        String[] endTime = b.split(" : ");
        
        int startHour = Integer.parseInt(startTime[0]);
        int startMinute = Integer.parseInt(startTime[1]);
        int startSecond = Integer.parseInt(startTime[2]);
        int endHour = Integer.parseInt(endTime[0]);
        int endMinute = Integer.parseInt(endTime[1]);
        int endSecond = Integer.parseInt(endTime[2]);
        
        if(endHour < startHour || (endHour == startHour && endMinute < startMinute)
          || (endHour == startHour && endMinute == startMinute && endSecond < startSecond)) {
            endHour += 24;
        }
        
        int startTotalSecond = startHour*60*60 + startMinute*60 + startSecond;
        int endTotalSecond = endHour*60*60 + endMinute*60 + endSecond;
        
        System.out.print(endTotalSecond - startTotalSecond);
    }
    
}