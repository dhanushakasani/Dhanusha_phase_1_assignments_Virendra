package stack;
import java.util.*;

public class StackOperations {
	

	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		Stack<Integer> stack3 = new Stack<Integer>();
		Stack<Character> stack4 = new Stack<Character>();
		
		stack1.push("apple");
		stack1.push("banana");
		stack1.push("mango");
		stack1.push("strawberry");
		
		System.out.println("index of element all inside the stack"+stack1.indexOf("All"));
		
		System.out.println("the element at the top of the "+"stack-1 is:"+stack1.peek());
		
		stack2.push("Delhi");
		stack2.push("hyderabad");
		stack2.push("rjy");
		
		System.out.println("index of element all inside the stack"+stack2.indexOf("All"));
		System.out.println("the element at the top of the "+"stack-2 is:"+stack2.peek());
		
		stack3.push(23);
		stack3.push(34);
		stack3.push(56);
		
		System.out.println("index of element all inside the stack"+stack3.indexOf("All"));
		System.out.println("the element at the top of the "+"stack-3 is:"+stack3.peek());
		
		stack4.push('a');
		stack4.push('d');
		stack4.push('e');
		System.out.println("index of element all inside the stack"+stack4.indexOf("All"));
		System.out.println("the element at the top of the "+"stack-4 is:"+stack4.peek());
		
		System.out.println(stack1);
		
		stack1.pop();
		stack1.pop();
		stack1.pop();
		

		System.out.println("after removing the elements:" +stack1);
		System.out.println(stack2);
		stack2.pop();
		stack2.pop();
		System.out.println("after removing the elements:" +stack2);
		System.out.println("the element at the top of the "+"stack-1 is:"+stack1.peek());
		System.out.println("the element at the top of the "+"stack-2 is:"+stack2.peek());
		
		
		stack3.pop();
		stack3.pop();
		System.out.println("after removing the elements:" +stack3);
		
		System.out.println("index of element all inside the stack1"+stack1.indexOf("apple"));
		System.out.println("index of element all inside the stack2"+stack2.indexOf("delhi"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
