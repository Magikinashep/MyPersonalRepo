import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<String>  paper_stack = new Stack<>();

        // arranging t-shirts in a stack
        paper_stack.push("blue paper");
        paper_stack.push("green paper");
        paper_stack.push("orange paper");
        paper_stack.push("violet paper");
        paper_stack.push("yellow paper");

        // Show the size of the stack
        System.out.println("The amount of papers are: " + paper_stack.size());

        // Show top element in the stack
        System.out.println("The top paper is: " + paper_stack.peek());

        // Remove top element in the stack
        paper_stack.pop();

        // Show all elements in Stack
        System.out.println("Plates left:  " + paper_stack);

        // Show top element in the stack
        System.out.println("The top Paper is: " + paper_stack.peek());

    }
}
