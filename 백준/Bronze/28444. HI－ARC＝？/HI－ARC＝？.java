import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        
        for(int i=0; i<input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        
        int first = arr[0] * arr[1];
        int second = arr[2] * arr[3] * arr[4];
        
        bw.write(Integer.toString(first - second));
        
        br.close();
        bw.flush();
    }
    
}