import java.util.*;

public class 单词接龙 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //把字典转成set
        Set<String> wordSet = new HashSet<>(wordList);

        //维护一个队列，记录要执行的列表
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);

        int wordLen = beginWord.length();
        int step = 1;
        while (!queue.isEmpty()) {

            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                String word = queue.poll();
                char[] charArray = word.toCharArray();

                for (int j = 0; j < wordLen; j++) {
                    char originChar = charArray[j];

                    for (char k = 'a'; k <= 'z'; k++) {
                        if (k == originChar) {
                            continue;
                        }

                        charArray[j] = k;
                        String nextWord = String.valueOf(charArray);

                        if (wordSet.contains(nextWord)) {
                            if (nextWord.equals(endWord)) {
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
        return 0;
    }

}
