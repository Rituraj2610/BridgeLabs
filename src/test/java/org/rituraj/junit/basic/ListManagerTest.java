package org.rituraj.junit.basic;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        assertEquals(Arrays.asList(5), list);
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListManager.removeElement(list, 2);
        assertEquals(Arrays.asList(1, 3), list);
    }

    @Test
    void testRemoveNonExistentElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        ListManager.removeElement(list, 5);
        assertEquals(Arrays.asList(1, 2, 3), list); // List remains unchanged
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertEquals(4, ListManager.getSize(list));
    }

    @Test
    void testNullList() {
        assertThrows(IllegalArgumentException.class, () -> ListManager.getSize(null));
        assertThrows(IllegalArgumentException.class, () -> ListManager.addElement(null, 10));
        assertThrows(IllegalArgumentException.class, () -> ListManager.removeElement(null, 5));
    }
}
