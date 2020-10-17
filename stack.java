import java.util.*;
class Stack
{
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size)
    {
        capacity=size;
        top=-1;
        arr=new int[size];
    }
    void push(int x)
    {
        if(top==capacity-1)
        {
            System.out.println("Stack is Full");
        }
        else
        {
        System.out.println("Push Element: "+x);
        arr[++top]=x;}
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
            //exit();
            return 0;
        }
        
            return arr[top--];
        
    }
    int getSize()
    {
        return top+1;
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
            System.out.println("Peek Element"+arr[top]);
    }
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println("Stack: "+arr[i]);
        }
    }
}
public class Main {
    public static void main(String args[])
    {
        Stack obj= new Stack(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        //obj.display();
        obj.pop();
        obj.pop();
        obj.display();
        obj.peek();
        System.out.println("Stack Size: "+obj.getSize());
        obj.push(6);
        obj.push(7);
        obj.push(8);
        obj.display();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.peek();
        
        
    }
}
