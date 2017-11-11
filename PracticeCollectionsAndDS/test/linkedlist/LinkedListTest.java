package linkedlist;

import linkedlist.CustomLinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedListTest {
    @Test
    public void linkedListAddTest() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Assert.assertEquals(list.size(), 5);
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(list.get(i), (Integer) i);
        }
        System.out.println(list);
    }
}
