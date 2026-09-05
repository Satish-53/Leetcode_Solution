#include <ctype.h>
#include <string.h>
bool isValid(char* word) {
    int n = strlen(word);
    if (n < 3)
        return false;
    int vowel = 0;
    int consonant = 0;
    for (int i = 0; i < n; i++) {
        if (!isalnum(word[i]))
            return false;
        if (isalpha(word[i])) {
            char c = tolower(word[i]);
            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                vowel = 1;
            } else {
                consonant = 1;
            }
        }
    }
    return vowel && consonant;
}