/***
 * created by huang ON 2020/7/7
 */
import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}


public class reversePrint {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = findNext(head, 0);
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }

    public ArrayList<Integer> findNext(ListNode head, int size){
        ArrayList<Integer> list;
        if(head == null){
            return new ArrayList<>();
        }
        if (head.next == null){
            list = new ArrayList<>();
            list.add(head.val);
        }else{
            list = findNext(head.next, size+1);
            list.add(head.val);
        }
        return list;
    }
}
