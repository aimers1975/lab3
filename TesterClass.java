import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesterClass {


    public static char[] myReverse(char[] s) {
        char temp;
        for (int i=0; i<(s.length)/2; i++) {
        	temp = s[i];
        	s[i] = s[(s.length-1)-i];
        	System.out.println(s[i]);
        	s[(s.length-i)-1] = temp;
        	System.out.println(s[(s.length-i)-1]);
        	System.out.println(s);
        }
        return s;

    }

public static boolean isAnagramSort(String s, String s2) {
	char[] first = s.toCharArray();
	char[] second = s2.toCharArray();
	Arrays.sort(first);
	Arrays.sort(second);
	s = new String(first);
	s2 = new String(second);
	if(s.equals(s2)) {
		return true;
	} else {
		return false;
	}

}

 public static char[] removeDuplicatesEff(char[] str) {
 	if (str == null) return str;
 	int len = str.length;
 	if (len < 2) return str;
 	boolean[] hit = new boolean[256];
 	for (int i = 0; i < 256; ++i) {
 		hit[i] = false;
 	}
 	hit[str[0]] = true;
 	int tail = 1;
 	for (int i = 1; i < len; ++i) {
 		if (!hit[str[i]]) {
 			str[tail] = str[i];
 			++tail;
 			hit[str[i]] = true;
 		}
 	}
 	str[tail] = 0;
 	return str;
 }

 public static char[] removeDuplicatesBad(char[] str) {
	 if (str == null) return str;
	 int len = str.length;
	 if (len < 2) return str;

	 int tail = 1; 

	 for (int i = 1; i < len; ++i) {
		 int j;
		 for (j = 0; j < tail; ++j) {
			 if (str[i] == str[j]) break;
		 }
		 if (j == tail) {
			 str[tail] = str[i];
			 ++tail;
		 }
	 }
	 str[tail] = 0;
	 return str;
 }

 public static boolean isAnagram(String s, String s2) {

    if(s.length() != s2.length()) {
    	return false;
    }
    int[] presentCount = new int[256];
    int[] presentCount2 = new int[256];
    char[] chars = s.toCharArray();
    char[] chars2 = s2.toCharArray();
    for(int i=0; i < chars.length; i++) {
    	presentCount[chars[i]] = presentCount[chars[i]]+1;
    	presentCount2[chars2[i]] = presentCount2[chars2[i]]+1;
    }
    System.out.println("Presentcount: " + Arrays.toString(presentCount));
    System.out.println("Presentcount2: " + Arrays.toString(presentCount2));
    if(Arrays.equals(presentCount,presentCount2)){
    	return true;
    } else {
    	return false;
    }
 }

 static String removeDuplicates(String s) {
    StringBuilder noDupes = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        String si = s.substring(i, i + 1);
        System.out.println("Substring is: " + si);
        if (noDupes.indexOf(si) == -1) {
            noDupes.append(si);
            System.out.println("noDupes is: " + noDupes.toString());
        }
    }
    return noDupes.toString();
}

    public static int[][] matrixRot(int[][] mymatrix) {
    	int saveItem;
    	int mylength = mymatrix[0].length-1;
    	for(int j=0; j < mylength/2;j++) {
	        for(int i = 0; i < mylength; i++) {
	        	saveItem = mymatrix[j][mylength-i];
	        	mymatrix[j][mylength-i] = mymatrix[j][i];
	        	mymatrix[j][i] = mymatrix[mylength-j][i];
	        	mymatrix[mylength-j][i] = mymatrix[mylength-j][mylength-i];
	        	mymatrix[mylength-j][mylength-i] =saveItem; 
	        }
        }
        return mymatrix;
    }

	public static int[][] createMatrix(int n, int m, int o) {
        int[][] mymatrix = new int[n][n];
		for (int[] row: mymatrix) {
		    Arrays.fill(row, 1);
		}
		for (int j=0; j<n; j++) {
			for(int i=0; i<n; i++) {
                if(i==m && j==o) {
                	mymatrix[i][j] = 5;
                }
                else {
                	mymatrix[i][j] = 2;
                }
			}
		}
		for(int i=0; i<mymatrix[0].length; i++) {
		    System.out.println("Matrix: " + Arrays.toString(mymatrix[i]));
        }
        return mymatrix;
	}


    public static void main(String[] args) {
    	int[] myArray = {0,2,4,6,8,10,12};
    	for(int myint : myArray) {
    		System.out.println("Num is: " + Integer.toString(myint));
    		System.out.println(Arrays.toString(myArray));
    		int index = Arrays.binarySearch(myArray, myint);
    		System.out.println("Index is: " + Integer.toString(index));
    		int[] subArray = Arrays.copyOfRange(myArray, index, myArray.length);
    		for(int newInt : subArray) {
    			System.out.println("Sub num is: " + Integer.toString(newInt));
    		}
    	}


    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        	int[][] testmatrix = createMatrix(5,0,2);
        	testmatrix = matrixRot(testmatrix);
			for(int i=0; i<testmatrix[0].length; i++) {
			    System.out.println("Final array: " + Arrays.toString(testmatrix[i]));
	        }
        	System.out.println("Enter a string");
        	String myString  = br.readLine();
        	String newString = removeDuplicates(myString);
        	System.out.println(newString + "\nEnter First anagram string: ");
        	String ana1 = br.readLine();
        	System.out.println("Enter string 2: ");
        	String ana2 = br.readLine();
        	if(isAnagramSort(ana1,ana2)) {
        		System.out.println("Is anagram!");
        	} else {
        		System.out.println("NO anagram!");
        	}
        } catch (IOException e) {
        	System.out.println("Error reading from input");
        }
    }

}