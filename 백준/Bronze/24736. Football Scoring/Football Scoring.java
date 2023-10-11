import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int firstTeamScore = 0;
        int secodTeamScore = 0;        
        
        String[] inputFirstTeamScore = br.readLine().split(" ");
        String[] inputSecondTeamScore = br.readLine().split(" ");
        
        int[] firstTeamScoreTable = new int[inputFirstTeamScore.length];
        int[] secondTeamScoreTable = new int[inputSecondTeamScore.length];
            
        for(int i=0; i<inputFirstTeamScore.length; i++) {
            firstTeamScoreTable[i] = Integer.parseInt(inputFirstTeamScore[i]);
            secondTeamScoreTable[i] = Integer.parseInt(inputSecondTeamScore[i]);
        }
        
        firstTeamScore = 
            firstTeamScoreTable[0] * 6
            + firstTeamScoreTable[1] * 3
            + firstTeamScoreTable[2] * 2
            + firstTeamScoreTable[3]
            + firstTeamScoreTable[4] * 2;
        
        secodTeamScore =
            secondTeamScoreTable[0] * 6
            + secondTeamScoreTable[1] * 3
            + secondTeamScoreTable[2] * 2
            + secondTeamScoreTable[3]
            + secondTeamScoreTable[4] * 2;
        
        bw.write(firstTeamScore + " " + secodTeamScore);
        
        bw.flush();
    }
    
}