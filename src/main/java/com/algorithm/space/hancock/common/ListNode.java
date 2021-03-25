package com.algorithm.space.hancock.common;


public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }

  public boolean equalTo(ListNode otherList) {
    ListNode pointer = this;
    ListNode otherPointer = otherList;

    while (pointer != null && otherPointer != null) {
      if (pointer.val != otherPointer.val) return false;
      pointer = pointer.next;
      otherPointer = otherPointer.next;
    }

    return pointer == null && otherPointer == null;
  }
}
