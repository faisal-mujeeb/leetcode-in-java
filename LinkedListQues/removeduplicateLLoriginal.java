public class removeduplicateLLoriginal {
    while(node.next != null){
        if(node.value == node.next.value){
            node.next = node.next.next;
            size--;
        }else{
            node = node.next;
        }
    }
    tail = node;
    tail.next = null;
}
