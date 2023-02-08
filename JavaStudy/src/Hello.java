import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Hello {

	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자 입력 >>");
		int number = Integer.parseInt(in.readLine());
		
		System.out.println(number);
	}
}
