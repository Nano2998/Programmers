import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {	

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = "";
		
		//System.out.println(input.isEmpty());
		
		while((input = br.readLine()) != null) {
						
			bw.write(input+"\n");
						
		}								
		
		br.close();
		bw.flush();
		bw.close();
		
	}
	
}
