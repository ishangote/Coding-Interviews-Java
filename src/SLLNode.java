public class SLLNode {
    private Integer nodeValue;
    private SLLNode next;

//toString
    @Override
    public String toString() {
        return "SinglyLinkedListNode{" +
                "nodeValue=" + nodeValue +
                ", next=" + next +
                '}';
    }
//Constructors
    public SLLNode() {}
    public SLLNode(Integer val) {
        this.nodeValue = val;
    }
    public SLLNode(Integer val, SLLNode nextNode) {
        this.nodeValue = val;
        this.next = nextNode;
    }

//Getters and Setters
    public Integer getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }
}