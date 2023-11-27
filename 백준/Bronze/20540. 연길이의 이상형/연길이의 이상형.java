import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        
        for(int i=0; i<4; i++) {
            if(str.charAt(i) == 'E') {
                result += 'I';
            } else if(str.charAt(i) == 'I') {
                result += 'E';
            } else if(str.charAt(i) == 'S') {
                result += 'N';
            } else if(str.charAt(i) == 'N') {
                result += 'S';
            } else if(str.charAt(i) == 'T') {
                result += 'F';
            } else if(str.charAt(i) == 'F') {
                result += 'T';
            } else if(str.charAt(i) == 'P') {
                result += 'J';
            } else if(str.charAt(i) == 'J') {
                result += 'P';
            } 
        }
        
        System.out.print(result);
    }
    
}