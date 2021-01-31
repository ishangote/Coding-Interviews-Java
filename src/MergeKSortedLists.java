import java.util.Comparator;
import java.util.PriorityQueue;

/*

klists = [
    1 -> 7 -> 8
    4 -> 6 -> 12 -> 15
   -5 -> 2 -> 5
         ^
 ]

minHeap = [2, 4, 7]
l3 = null

l3 -> -5 -> 1 -> 7

 */
public class MergeKSortedLists {
    public SLLNode mergeKLists(SLLNode[] heads){
        Comparator<SLLNode> valueComparator = Comparator.comparing(SLLNode::getNodeValue);
        PriorityQueue<SLLNode> minHeap = new PriorityQueue<>(valueComparator);
        for (SLLNode head : heads){
            if (head != null) minHeap.add(head);
        }

        SLLNode dummy = new SLLNode();
        SLLNode cur = dummy;

        while (minHeap.size() != 0){
            SLLNode minNode = minHeap.poll();
            cur.setNext(minNode);
            minNode = minNode.getNext();
            if (minNode != null) minHeap.add(minNode);
            cur = cur.getNext();
        }
        return dummy.getNext();
    }
}
