import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	
	private ArrayList<Integer> array;
	public Stack() {
		array = new ArrayList<Integer>();
	}
	
	public boolean pop() {
		int size = array.size();
		if (isEmpty()) return false;
		array.remove(size - 1);
		return true;
	}
	
	public boolean push(int element) {
		return array.add(element);
	}
	
	public int size() {
		return array.size();
	}
	
	public boolean isEmpty() {
		return array.isEmpty();
	}
	
	public int top() {
		if (!isEmpty()) {
			return array.get(array.size() - 1);
		}
		else return -1;
	}
	
}
