class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
  // Time complexity = O(1) for Push,Pop and Peek
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        if (top <0)
            System.out.println("Stack is empty"); 
            return true;
        else{
            return false;
        }
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if (top >= MAX-1){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top]=x;
            System.out.println("Element pushed");
            return true;

        }
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(top<0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int r= a[top--];
            return r;}
    } 
  
    int peek() 
    { 
        //Write your code here
        if(top<0){
            System.out.println("Staack is empty");
            return 0;
        }
        else
            return a[top];
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
