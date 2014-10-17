import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RemoveChars {

    public String removeCharsFromString(char *mystring) {
    	char * end = mystring;
    	char tmp;

    	if(str) {
    		while (*end) {
    			++end;
    		}
    		--end;
    		while (mystring < end) {
    			tmp = *mystring;
    			*mystring++ = *end;
    			*end-- = tmp;
    		}
    	}
    	return  *mystring;

    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        String s = br.readLine();
        Sring reversed = removeCharsFromString(s);
        System.out.println(reversed);
  	
    }

}