import java.util.Stack;

/***
 * created by huang ON 2020/7/8
 */

public class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.empty() && stack2.empty()){
            return -1;
        }else if(stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }

}
