struct ListNode* addTwoNumbers(struct ListNode* a, struct ListNode* b) {
    struct ListNode dummy;
    struct ListNode *curr = &dummy;
    curr->next = NULL;
    int carry = 0;
    while (a != NULL || b != NULL || carry != 0) {
        int total = carry;
        if (a) {
            total += a->val;
            a = a->next;
        }
        if (b) {
            total += b->val;
            b = b->next;
        }
        carry = total / 10;
        struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
        node->val = total % 10;
        node->next = NULL;

        curr->next = node;
        curr = node;
    }
    return dummy.next;
}