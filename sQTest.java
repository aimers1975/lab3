import java.util.*;
import java.io.*;

public class sQTest {

    public static void main(String[] args) {

    	stackQueue tester = new stackQueue();
    	if (tester != null) {
	    	for(int i=0; i<5; i++) {
	            tester.add(i);
	    	}
	    	System.out.println("Tester size is: " + Integer.toString(tester.size()));
	    	try {
	    	    assert (tester.size() == 6);
	    	} catch (AssertionError e) {
	    		System.out.println("The stack is not the expected size.");
	    	}
	    	int x = tester.size();
	    	for(int i=0; i<x; i++) {
	    		int n = tester.remove();
	    		System.out.println("this item is: " + Integer.toString(n));
	    	}
	    } else {
	    	System.out.println("Tester is equal to null.");
	    }
	    System.out.println("Result of null test: " + Integer.toString(tester.remove()));

    }
}