package com.wurui.algorithm;

/**
 * @description:
 * @author: wurui
 * @create: 2018-10-18 11:48
 **/
public class Solution {
    //输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
    //输出：7 -> 0 -> 8
    //原因：342 + 465 = 807
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode preNode = headNode;
        int carry = 0;
        while (l1 !=null || l2 !=null){
            int x = l1 == null ?0:l1.val;
            int y = l2 == null ?0:l2.val;
            int sum = x + y + carry;
            if (sum >= 10){
                sum = sum - 10;
                carry = 1;
            }else {
                carry = 0;
            }

            ListNode cur = new ListNode(sum);

            preNode.next = cur;

            preNode = cur;

            l1 = l1 == null?null:l1.next;
            l2 = l2 == null?null:l2.next;
        }

        if (carry > 0 ){
            ListNode cur = new ListNode(1);
            preNode.next = cur;
        }

        return headNode.next;
    }
    
    public static void main(String[] args){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode node = solution.addTwoNumbers(l1,l2);
        System.out.println(node.val);
    }
}
