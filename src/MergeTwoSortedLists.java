public class MergeTwoSortedLists {
    public SLLNode mergeTwoLists(SLLNode l1, SLLNode l2){
        SLLNode dummy = new SLLNode(-1111);
        SLLNode l3 = dummy;

        while (l1 != null && l2 != null){
            if (l1.getNodeValue() <= l2.getNodeValue()){
                l3.setNext(l1);
                l1 = l1.getNext();
            } else {
                l3.setNext(l2);
                l2 = l2.getNext();
            }
            l3 = l3.getNext();
        }

        if (l1 != null) l3.setNext(l1);
        else if (l2 != null) l3.setNext(l2);

        return dummy.getNext();
    }
}
