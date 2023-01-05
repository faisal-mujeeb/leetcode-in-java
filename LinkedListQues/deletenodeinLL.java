
  public class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
	public void deleteNode(ListNode node) {
	node.val = node.nexnode.next = node.next.next;

								}
							}