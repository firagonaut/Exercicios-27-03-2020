package Pilha;



public class Principal {
	
	public static void main (String[] args)
	{
		PilhaC stack = new PilhaC(3);

		stack.push(1);		// Inserting 1 in the stack
		stack.push(2);		// Inserting 2 in the stack

		stack.pop();		// removing the top 2
		stack.pop();		// removing the top 1

		stack.push(3);		// Inserting 3 in the stack

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Stack size is " + stack.size());

		stack.pop();		// removing the top 3

		// check if stack is empty
		if (stack.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
	}

}
