/*
Questions:
1. Is it a singly linked list? Yes

Examples:
input
h
1 -> 2 -> 3 -> None
output
None <- 1 <- 2 <- 3
                  h

1 -> 2 -> 3 -> None
c    t
prev = None

Logic:
tmp = c.next
cur.next = prev
prev = cur
cur = tmp

Time: O(n) n is number of nodes
Space: O(1)
 */
public class ReverseSinglyLinkedList{
    public SLLNode reverseList(SLLNode head){
        if (head == null) return null;

        SLLNode prev = null;

        while (head != null) {
            SLLNode tempNextNode = head.getNext();
            head.setNext(prev);
            prev = head;
            head = tempNextNode;
        }
        return prev;
    }
}
