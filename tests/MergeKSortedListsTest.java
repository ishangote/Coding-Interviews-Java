import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeKSortedListsTest {
    //{Expected answer: heads}
    private Map<SLLNode, SLLNode[]> allTests = new HashMap<>();

    @BeforeEach
    void setUp() {
//        TEST 1
        ArrayList<Integer> vals1 = new ArrayList<>(Arrays.asList(1, 7, 8));
        ArrayList<Integer> vals2 = new ArrayList<>(Arrays.asList(4, 6, 12, 15));
        ArrayList<Integer> vals3 = new ArrayList<>(Arrays.asList(-5, 2, 5));
        SinglyLinkedList sll1 = new SinglyLinkedList(), sll2 = new SinglyLinkedList(), sll3 = new SinglyLinkedList();
        SLLNode[] allHeads = new SLLNode[3];

        allHeads[0] = sll1.createSLL(vals1);
        allHeads[1] = sll2.createSLL(vals2);
        allHeads[2] = sll3.createSLL(vals3);

        allTests.put(sll3.getHead(), allHeads);
    }

    @Test
    void mergeKLists() {
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();

        for (Map.Entry<SLLNode, SLLNode[]> entry : allTests.entrySet()){
            assertEquals(entry.getKey(), mergeKSortedLists.mergeKLists(entry.getValue()));
        }
    }
}