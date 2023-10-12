import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if(str.equals("SONGDO")) {
            System.out.print("HIGHSCHOOL");
        } else if(str.equals("CODE")) {
            System.out.print("MASTER");
        } else if(str.equals("2023")) {
            System.out.print("0611");
        } else if(str.equals("ALGORITHM")) {
            System.out.print("CONTEST");
        }
    }
    
}