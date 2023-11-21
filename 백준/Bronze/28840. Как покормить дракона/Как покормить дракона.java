import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        String[] arr = a.split(":");
        String[] array = b.split(":");
        
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int xx = Integer.parseInt(array[0])+24;
        int yy = Integer.parseInt(array[1]);
        
        xx -= x;
        yy -= y;
        
        if(yy < 0) {
            xx--;
            yy += 60;
        }
        
        String hour = "";
        String minute = "";
        
        if(xx < 10 && xx > 0) {
            hour = "0" + xx;
        } else if(xx == 0) {
            hour = "00";
        } else {
            hour += xx;
        }
        
        if(yy < 10 && yy > 0) {
            minute = "0" + yy;
        } else if(yy == 0) {
            minute = "00";
        } else {
            minute += yy;
        }
        
        System.out.print(hour+':'+minute);
    }
    
}