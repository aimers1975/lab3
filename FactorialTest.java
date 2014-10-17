import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialTest {

	public static int returnFact (int n) {

		if(n==1) {
			return 1;
		}
		else {
			return n * returnFact(n-1);
		}
	}

    public static void main(String[] args) {
    	try {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a number");
		    String s = br.readLine();
		    try {
		        int myInt = Integer.parseInt(s);
		        System.out.print(returnFact(myInt));
		    } catch (NumberFormatException e) {
		        System.out.print("An error occurred.");
		    }
		} catch (IOException e) {
			System.out.println("An error occurred reading.");
		}
    }

}