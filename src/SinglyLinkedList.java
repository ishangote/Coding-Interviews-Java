/*
       1 > 2 > 3 > 4 > 5
       h               t
 */

import java.util.ArrayList;

public class SinglyLinkedList {
    private SLLNode head = null, tail = null;

    public SLLNode getHead() {
        return head;
    }

    public SLLNode getTail() {
        return tail;
    }

    public void insertNode(Integer nodeVal) {
        SLLNode node = new SLLNode(nodeVal);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = tail.getNext();
        }
    }

    public SLLNode createSLL(ArrayList<Integer> vals){
        if (vals.size() == 0) return null;
        for (Integer val : vals){
            insertNode(val);
        }
        return head;
    }

    public ArrayList<Integer> printSLL(){
        SLLNode cur = head;
        ArrayList<Integer> res = new ArrayList<>();
        while (cur != null){
            res.add(cur.getNodeValue());
            cur = cur.getNext();
        }
        return res;
    }
}
