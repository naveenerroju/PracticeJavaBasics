package leetcode;

public class MergeTwoSortedLists {
    public ListNode solutioin(ListNode list1, ListNode list2){
        int list1Size = 0;
        while (list1.next!=null){
            list1Size++;
        }
        int list2Size = 0;
        while (list2.next!=null){
            list2Size++;
        }
        int largestSize = list1Size>list2Size?list1Size:list2Size;
        ListNode merged = new ListNode();
        while (list1!=null && list2!=null){
            if(list1.val>list2.val){

            }
        }
        return merged;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}