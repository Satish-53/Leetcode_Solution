/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool isSameTree(struct TreeNode* p, struct TreeNode* q) {
     // If both nodes are NULL
    if (p == NULL && q == NULL)
        return true;

    // If one node is NULL and the other is not
    if (p == NULL || q == NULL)
        return false;

    // Check current node value and recursively check left & right subtrees
    return (p->val == q->val) &&
           isSameTree(p->left, q->left) &&
           isSameTree(p->right, q->right);
}