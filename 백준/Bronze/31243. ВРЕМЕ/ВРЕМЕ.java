import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] minute = new int[3];
        
        for(int i=0; i<3; i++) {
            int startHour = sc.nextInt();
            int startMinute = sc.nextInt();
            int endHour = sc.nextInt();
            int endMinute = sc.nextInt();
            
            if(startHour > endHour || (startHour == endHour && startMinute > endMinute)) {
                endHour += 24;
            }
            
            startMinute += startHour*60;
            endMinute += endHour*60;
            
            minute[i] = endMinute-startMinute;
        }
        
        int minMinute = Math.min(minute[0], Math.min(minute[1], minute[2]));
        int maxMinute = Math.max(minute[0], Math.max(minute[1], minute[2]));
        
        int minHour = minMinute/60;
        minMinute %= 60;
        int maxHour = maxMinute/60;
        maxMinute %= 60;
        
        String strMinMinute = "";
        String strMaxMinute = "";
        
        if(minMinute >= 10) {
            strMinMinute += minMinute;
        } else {
            strMinMinute = "0"+minMinute;
        }
        
        if(maxMinute >= 10) {
            strMaxMinute += maxMinute;
        } else {
            strMaxMinute = "0"+maxMinute;
        }
        
        System.out.println(minHour+":"+strMinMinute);
        System.out.println(maxHour+":"+strMaxMinute);
    }
    
}