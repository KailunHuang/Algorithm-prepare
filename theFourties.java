import java.util.*;

public class theFourties {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int pop_index = 0;
        for (int i = 0; i < pushed.length; i++){
            if(stack.push(pushed[i])==popped[pop_index]){
                stack.pop();
                pop_index++;
            }
        }
        while(pop_index<popped.length){
            if(stack.peek()!=popped[pop_index]){
                return false;
            }else{
                stack.pop();
                pop_index++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    
    public static String[] permutation(String s) {
        if(s == null || s.equals("")) {
            return new String[0];
        }
        Set<String> set = new HashSet<String>();
        char[] charlist = s.toCharArray();
        char[] temp = new char[s.length()];
        boolean[] visit = new boolean[s.length()];
        Permuattion(0, charlist, temp, visit, set);
        String[] result = new String[set.size()]; 
        set.toArray(result);
        System.out.println(set);
        return result;
    }
    
    public static void Permuattion(int index, char[] charlist, char[] temp, boolean[] visit, Set<String> set){
        if (index==charlist.length){
            set.add(new String(temp));
            return; 
        }
        for (int i = 0; i < charlist.length; i++){
            if(!visit[i]){
                temp[index] = charlist[i];
                visit[i] = true;
                Permuattion(index+1, charlist, temp, visit, set);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] in = {1,2,3,4,5};
        int[] out = {4,5,3,1,2};
        // System.out.println(validateStackSequences(in, out));
        String s = "Hello";
        permutation("abc");

    }
}