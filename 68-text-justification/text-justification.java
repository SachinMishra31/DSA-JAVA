import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < words.length) {
            int lineLength = words[i].length();
            int j = i + 1;

            // Try to fit as many words as possible in the line
            while (j < words.length && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();  // 1 space + word length
                j++;
            }

            int numberOfWords = j - i;
            int totalSpaces = maxWidth - (lineLength - (numberOfWords - 1)); // spaces to distribute
            StringBuilder line = new StringBuilder();

            // Last line or line with only one word → left-justified
            if (j == words.length || numberOfWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                // Add trailing spaces to match maxWidth
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spacesBetweenWords = totalSpaces / (numberOfWords - 1);
                int extraSpaces = totalSpaces % (numberOfWords - 1);

                for (int k = i; k < j - 1; k++) {
                    line.append(words[k]);
                    int spacesToAdd = spacesBetweenWords + (k - i < extraSpaces ? 1 : 0);
                    for (int s = 0; s < spacesToAdd; s++) {
                        line.append(" ");
                    }
                }
                line.append(words[j - 1]); // last word
            }

            result.add(line.toString());
            i = j; // move to the next set of words
        }

        return result;
    }
}
