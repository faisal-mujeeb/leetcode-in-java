//https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode list1 ,ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list!=null) ? list1.val;
        return dummyHead.next;
    }
}
