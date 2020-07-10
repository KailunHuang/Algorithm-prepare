import java.util.ArrayList;

public class theTwenties {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int[] exchange(int[] nums) {
        int size = nums.length;
        int front_index = 0;
        int back_index = size-1;
        while(front_index < back_index){
            int front_number = nums[front_index];
            int back_number = nums[back_index];
            if (front_number%2==0 && back_number%2==1){
                int temp = back_number;
                front_number = back_number;
                back_number = front_number;
                front_index+=1;
                back_index-=1;
            }else if(front_number%2==0 && back_number%2==0){
                back_index -= 1;
            }else if(front_number%2==1 && back_number%2==1){
                front_index += 1;
            }else{
                front_index+=1;
                back_index-=1;
            }
        }
        return nums;
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        int size = 0;
        ListNode temp_list = head; 
        while(temp_list!=null){
            temp_list=temp_list.next;
            if(size >= k){
                head=head.next;
            }
        }
        return head;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode current = head, result = null;
        while(current != null){
            ListNode temp = current.next;
            current.next = result;
            result = current;
            current = temp;
            
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,6};
        System.out.println(exchange(nums));
    }
}