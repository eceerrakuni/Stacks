import java.util.Arrays;

/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	int size;
	int count = 0;
	private Object a[];
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	public Stack(int size) {
		a = new Object[size];
		this.size = size;
	}

	@Override
	public boolean push(String record) {
		count = count + 1;
		if (count == 9) {
			count = 8;
			return false;
		} else {
			a[count - 1] = record;
			return true;
		}
	}

	@Override
	public String pop() {
		if (count == size) {
		count = count - 1;
		String c = (String) a[count];
		a[count] = null;
		return c;
		} else {
			count = count - 1;
			String d = (String) a[count + 1];
			a[count + 1] = null;
			return d;
		}
	}

	@Override
	public void printStack() {
		System.out.println(Arrays.toString(a));
		
	}
	
	
	
}