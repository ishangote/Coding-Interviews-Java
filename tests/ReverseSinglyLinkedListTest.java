import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSinglyLinkedListTest {
    private Map<SLLNode, SLLNode> allTestsMap = new HashMap<>();

    @BeforeEach
    void setUp(){
        SLLNode node1 = new SLLNode(1);
        SLLNode node2 = new SLLNode(2);
        SLLNode node3 = new SLLNode(3);
        SLLNode node4 = new SLLNode(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        SLLNode node5 = new SLLNode(1);
        allTestsMap.put(node1, node4);
        allTestsMap.put(node5, node5);
        allTestsMap.put(null, null);
    }

    @Test
    void reverseListTest() {
        ReverseSinglyLinkedList reverseSinglyLinkedList = new ReverseSinglyLinkedList();
        for (Map.Entry<SLLNode, SLLNode> entry : allTestsMap.entrySet()){
            SLLNode head = entry.getKey();
            SLLNode reverseHead = entry.getValue();
            assertEquals(reverseHead, reverseSinglyLinkedList.reverseList(head));
        }
    }
}