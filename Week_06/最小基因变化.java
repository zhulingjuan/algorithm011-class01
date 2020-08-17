import java.util.*;

public class 最小基因变化 {
    public int minMutation(String start, String end, String[] bank) {

        Set<String> wordSet = new HashSet<>(Arrays.asList(bank));


        Queue<String> queue = new LinkedList<>();
        queue.offer(start);

        char[] ACGT = {'A', 'C', 'G', 'T'};


        int wordLen = start.length();
        int step = 0;
        while (!queue.isEmpty()) {

            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String word = queue.poll();
                char[] charArray = word.toCharArray();

                for (int j = 0; j < wordLen; j++) {
                    char originChar = charArray[j];


                    for (int k = 0; k < ACGT.length; k++) {

                        if (k == originChar) {
                            continue;
                        }
                        charArray[j] = ACGT[k];
                        String nextWord = String.valueOf(charArray);

                        if (wordSet.contains(nextWord)) {
                            if (nextWord.equals(end)) {
                                return step + 1;
                            }

                            queue.add(nextWord);
                            wordSet.remove(nextWord);
                        }


                    }

                    // 恢复
                    charArray[j] = originChar;
                }
            }
            step++;
        }
        return -1;

    }


}


