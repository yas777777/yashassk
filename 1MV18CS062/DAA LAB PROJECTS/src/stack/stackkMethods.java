package stack;
import java.util.*;
public class stackkMethods 
{
	int top;
	int size;
	int[] stack;
	public stackkMethods(int arraySize)
	{
		size=arraySize;
		stack=new int [size];
		top=-1;
	}
	public void push(int value)
	{
		if(top==size-1)
		{
			System.out.println("stack is full cant push");
		}
		else
		{
			top=top+1;
			stack[top]=value;
		}
	}
	public int pop ()
	{
		int t=0;
		if(top==-1)
		{
			System.out.println("cant pop stack empty");
			return -1;
		}
		else
		{
			t=top--;
			return stack[t];
			
		}
	}
	public void display() 
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+" ");
		}
		System.out.println("\n");
	}
}
public class stack1
{
	
}