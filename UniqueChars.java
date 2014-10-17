import java.util.*;

public class UniqueChars {

    public static boolean hasUniqueChars(char[] checkinput) {
        Boolean[] isPresent = new Boolean[1000];
        Arrays.fill(isPresent, Boolean.FALSE);

        for(char thisChar : checkinput) {
           if(isPresent[thisChar]) {
              return false;
           } else {
              isPresent[thisChar] = true;
           }
        }
        return true;


    }
	
	public static void main(String[] args) {

	  String myString = "apiecof";
	  if(hasUniqueChars(myString.toCharArray())) {
	    System.out.println("Unique chars!\n");
	  } else {
	    System.out.println("Not unique chars!\n");
	  }



	}
}