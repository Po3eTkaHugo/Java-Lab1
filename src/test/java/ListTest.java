import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @org.junit.jupiter.api.Test
    void addTestInteger() {
        List<Integer> list1 = new List<Integer>();
        list1.add(1);
        assertEquals(1,list1.get(0));
    }
    @org.junit.jupiter.api.Test
    void addTestString() {
        List<String> list1 = new List<String>();
        list1.add("ABOBA");
        assertEquals("ABOBA",list1.get(0));
    }

    @org.junit.jupiter.api.Test
    void getTest() {
        List<Integer> list1 = new List<Integer>();
        list1.add(1);
        assertEquals(1, list1.get(0));
    }

    @org.junit.jupiter.api.Test
    void deleteTest() {
        List<Integer> list1 = new List<Integer>();
        int[] testArray = {0, 2};
        list1.add(2);
        list1.add(1);
        list1.add(0);
        list1.delete(1);

        boolean flag = true;
        for (int i = 0; i < 2; i++) {
            if (testArray[i] != list1.get(i)) flag = false;
        }

        assertTrue(flag);
    }
    @org.junit.jupiter.api.Test
    void deleteFirstTest() {
        List<Integer> list1 = new List<Integer>();
        int[] testArray = {1, 2};
        list1.add(2);
        list1.add(1);
        list1.add(0);
        list1.delete(0);

        boolean flag = true;
        for (int i = 0; i < 2; i++) {
            if (testArray[i] != list1.get(i)) flag = false;
        }

        assertTrue(flag);
    }
}