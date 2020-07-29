 public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        //counting length of linked list
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int mid = (int)Math.ceil(count/2);
        //new head pointer 
        ListNode x = head;
        int i =0;
        while(i<mid){
            i++;
            x = x.next;
        }
        return x;
    }