import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            
            if(str.equals("Present!")) {
                arr.remove(arr.size()-1);
            } else {
                arr.add(str);
            }
        }
        
        if(arr.isEmpty()) {
            System.out.print("No Absences");
        } else {
            for(String name : arr) {
                System.out.println(name);
            }
        }
    }
    
}