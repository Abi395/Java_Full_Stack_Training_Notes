package Day15;

class Stack{
    private int maxSize;
    private int top;
    private int[] StackArray;

    Stack(int size){
        maxSize=size;
        StackArray = new int[maxSize];
        top = -1;
    }
    //push opeartion
    public void push(int d){
        if(top == maxSize-1){
            System.out.println("Stack overflow");
        }
        else{
            StackArray[++top] = d;
        }
    }

    //pop operation

    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return StackArray[top--];
        }
    }

    //peek opearion
    public int peek(){
        if(top ==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return StackArray[top];
        }
    }
    //to create the display
    public boolean isEmpty(){
        return top == -1;
    }
    //to display
    public void display(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(StackArray[i]);
            }
        }
    }
}
public class StackArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(6);
        // s.push(5);
        // s.push(9);
        // s.push(40);
        System.out.println("Popped element : " +s.pop());
        System.out.println("Peeked element : " +s.peek());
        s.display();
    }
}
