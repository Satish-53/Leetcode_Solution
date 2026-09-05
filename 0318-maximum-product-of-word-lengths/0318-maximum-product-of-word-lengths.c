int maxProduct(char** words, int wordsSize) {
    int mask[wordsSize];
    int len[wordsSize];
    for (int i = 0; i < wordsSize; i++) {
        mask[i] = 0;
        len[i] = 0;
        for (int j = 0; words[i][j] != '\0'; j++) {
            mask[i] |= 1 << (words[i][j] - 'a');
            len[i]++;
        }
    }
    int max = 0;
    for (int i = 0; i < wordsSize; i++) {
        for (int j = i + 1; j < wordsSize; j++) {
            if ((mask[i] & mask[j]) == 0) {
                int product = len[i] * len[j];
                if (product > max) {
                    max = product;
                }
            }
        }
    }
    return max;
}