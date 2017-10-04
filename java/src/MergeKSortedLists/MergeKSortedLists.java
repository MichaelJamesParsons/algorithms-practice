package MergeKSortedLists;

class MergeKSortedLists {
    /**
     * Naive implementation
     */
    ListNode mergeKListsNaive(ListNode[] lists) {
        ListNode mergedList = null;
        ListNode lastMergedNode = null;
        boolean hasMore = true;

        while(hasMore) {
            hasMore = false;
            Integer minIndex = null;

            for(int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    hasMore = true;
                    if (minIndex == null || lists[minIndex].val > lists[i].val) {
                        minIndex = i;
                    }
                }
            }

            if (minIndex == null) {
                continue;
            }

            ListNode tmp = lists[minIndex].next;
            if (mergedList == null) {
                mergedList = lists[minIndex];
                lastMergedNode = lists[minIndex];
            } else {
                lastMergedNode.next = lists[minIndex];
                lastMergedNode = lastMergedNode.next;
            }

            lists[minIndex] = tmp;
        }

        return mergedList;
    }

    /**
     * Optimized using priority queues
     */
    ListNode mergeKLists(ListNode[] lists) {
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}