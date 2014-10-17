import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stackQueue {
	   Stack<Integer> s1;
	   Stack<Integer> s2;
	
    public stackQueue() {
       s1 = new Stack<Integer>();
       s2 = new Stack<Integer>();

    }

    public void add(int i){
        while(!s2.empty()) {
                s1.push(s2.pop());
            }
        s1.push(i);
    }

    public int remove() {
        while(!s1.empty()) {
        	s2.push(s1.pop());
        }
        if (!s2.empty()) {
            return s2.pop();
        } else {
        	return -1;
        }
    }

    public int peek(int index) {
        while(!s1.empty()) {
            s2.push(s1.pop());
        }
        return s2.peek();

    }

    public int size() {
        return s1.size() + s2.size();
    }

}