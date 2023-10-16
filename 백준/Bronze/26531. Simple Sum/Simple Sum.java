import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        int a = Character.getNumericValue(str.charAt(0));
        int b = Character.getNumericValue(str.charAt(4));
        int c = Character.getNumericValue(str.charAt(8));
        
        String result = a + b == c ? "YES" : "NO";
        
        System.out.print(result);
        
        br.close();
        bw.flush();
        bw.close();
    }
    
}