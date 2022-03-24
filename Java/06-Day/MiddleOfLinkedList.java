class Solution {
    public ListNode middleNode(ListNode head) {
        
         ListNode quick= head;
        ListNode slow= head;
            while(quick.next != null&& quick.next.next != null ){
                    quick = quick.next.next; // double jump
                  
                    slow = slow.next; // normal
            }
            if(quick.next != null)  
			{                
                    return slow.next;
            }
            return slow;
        
    }
}