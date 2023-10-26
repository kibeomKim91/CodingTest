import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kda = sc.nextLine();
        String[] kdaArr = kda.split("/");
        
        int kill = Integer.parseInt(kdaArr[0]);
        int death = Integer.parseInt(kdaArr[1]);
        int assi = Integer.parseInt(kdaArr[2]);
        
        if(kill+assi < death || death == 0) {
            System.out.print("hasu");
        } else {
            System.out.print("gosu");
        }
    }
    
}