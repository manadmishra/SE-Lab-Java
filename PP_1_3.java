import java.util.Stack;

public class PP_1_3{

	
		public static void main(String args[])
		{
			Stack stack=new Stack();
			stack.push(10);
			stack.push("a");
			System.out.println("The contents of the stack is "+ stack);
			System.out.println("The size of the stack is "+ stack.size());
			System.out.println("The number popped out is "+ stack.pop());
			System.out.println("The contents of the stack is "+ stack);
			System.out.println("The size of the stack is "+ stack.size());




		}
	
}