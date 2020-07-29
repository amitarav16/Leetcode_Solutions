class Leetcode_1290{
	public int getDecimalValue(ListNode head) {
        if(head == null){
            return 0;
        }
        ListNode temp = head;
        String ans = "";
        while(temp != null){
            ans+= temp.val;
            temp = temp.next;            
        }
        int num=Integer.parseInt(ans,2);  
        // int num = 0;
        // for(int i=0;i<ans.length();i++){
        //     num+= ans.charAt(i)*Math.pow(2,i);
        // }
        return num;
        
    }
}