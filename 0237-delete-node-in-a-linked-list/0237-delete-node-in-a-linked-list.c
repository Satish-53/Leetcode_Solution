/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

void deleteNode(struct ListNode* node) {
    struct ListNode *temp = node;
    node->val = node->next->val;
    node = node->next;
    temp->next = node->next;
    free(node);
}
