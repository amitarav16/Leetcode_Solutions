public class Leetcode_21{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)  return l2;
        if(l2 == null) return l1;
        ListNode l3 = null;
        if(l1.val<l2.val){
            l3 = l1;
            l1 = l1.next;
        }
        else{
            l3 = l2;
            l2 = l2.next;
        }
        ListNode current = l3;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 == null){
            current.next = l2;
        }
        else{
            current.next = l1;
        }
        return l3;
        
    }
}