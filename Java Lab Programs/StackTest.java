public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1); stack.push(8); stack.push(3);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
		stack.push(5); stack.push(4); stack.push(3);
		while (!stack.isEmpty()) {
			System.out.println(stack.top());
			stack.pop();
		}
	}
}
