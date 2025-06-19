import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < words.length) {
            int lineLength = words[i].length();
            int j = i + 1;

            
            while (j < words.length && lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length(); 
                j++;
            }

            int numberOfWords = j - i;
            int totalSpaces = maxWidth - (lineLength - (numberOfWords - 1)); 
            StringBuilder line = new StringBuilder();

            
            if (j == words.length || numberOfWords == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }

                
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
                line.append(words[j - 1]); 
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}
