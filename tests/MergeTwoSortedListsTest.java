import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    private ArrayList<SLLNode[]> allTests = new ArrayList<>();

    @BeforeEach
    void setUp() {
        SLLNode l1;
        SLLNode l2;

//        ----------------------------------

        l1 = new SLLNode(1);
        l1.setNext(new SLLNode(2));
        l1.getNext().setNext(new SLLNode(4));

        l2 = new SLLNode(1);
        l2.setNext(new SLLNode(3));
        l2.getNext().setNext(new SLLNode(4));
        l2.getNext().getNext().setNext(new SLLNode(5));

        SLLNode[] test1 = new SLLNode[3];
        test1[0] = l1;
        test1[1] = l2;
        test1[2] = l1;
        allTests.add(test1);

//        ----------------------------------

        l1 = new SLLNode(1);
        l1.setNext(new SLLNode(2));
        l1.getNext().setNext(new SLLNode(4));

        l2 = null;

        SLLNode[] test2 = new SLLNode[3];
        test2[0] = l1;
        test2[1] = l2;
        test2[2] = l1;
        allTests.add(test2);

//        ----------------------------------

        SLLNode[] test3 = new SLLNode[3];
        test3[0] = null;
        test3[1] = null;
        test3[2] = null;
        allTests.add(test3);
    }

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        for (SLLNode[] test : allTests){
            SLLNode l1 = test[0];
            SLLNode l2 = test[1];
            SLLNode l3 = test[2];
            assertEquals(l3, mergeTwoSortedLists.mergeTwoLists(l1, l2));
        }
    }
}