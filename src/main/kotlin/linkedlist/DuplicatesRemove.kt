package linkedlist

/**
 * 82，83 删除链表中的重复元素
 *
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class DuplicatesRemove1 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        // handle base case
        if (head == null) {
            return null
        }

        // pass head to current
        var current = head
        while (current!!.next != null) {
            if (current.`val` == current.next!!.`val`) {
                // if current value equals to next value
                // remove the next one
                current.next = current.next!!.next
            } else {
                // if current value unequals to next value
                // pass next node to current
                current = current.next
            }
        }
        return head
    }
}

class DuplicatesRemove2 {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) {
            return head
        }

        val dummy = ListNode(0).apply {
            next = head
        }

        var current = dummy
        while (current.next != null && current.next?.next != null) {
            if (current.next!!.`val` == current.next!!.next!!.`val`) {
                val x = current.next!!.`val`
                while (current.next != null && current.next!!.`val` == x) {
                    current.next = current.next!!.next
                }
            } else {
                current = current.next!!
            }
        }

        return dummy.next
    }
}
