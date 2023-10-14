import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goal = sc.nextLine();
        int scoreA = 0;
        int scoreB = 0;
        int totalGoal = goal.length();
        
        for(int i=0; i<totalGoal; i++) {
            if(goal.charAt(i) == 'A') {
                scoreA++;
            } else if(goal.charAt(i) == 'B') {
                scoreB++;
            }
        }
        
        System.out.print(scoreA + " : " + scoreB);
    }
    
}