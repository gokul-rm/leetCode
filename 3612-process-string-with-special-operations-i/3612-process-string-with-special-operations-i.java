import java.util.*;

class Solution {
    public String processStr(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        boolean reversed = false;

        for (char ch : s.toCharArray()) {
            if (ch == '%') {
                reversed = !reversed;
            } 
            else if (ch == '*') {
                if (!dq.isEmpty()) {
                    if (!reversed) {
                        dq.removeLast();
                    } else {
                        dq.removeFirst();
                    }
                }
            } 
            else if (ch == '#') {
                int size = dq.size();
                Character[] arr = dq.toArray(new Character[0]);

                if (!reversed) {
                    for (int i = 0; i < size; i++) {
                        dq.addLast(arr[i]);
                    }
                } else {
                    for (int i = size - 1; i >= 0; i--) {
                        dq.addFirst(arr[i]);
                    }
                }
            } 
            else {
                if (!reversed) {
                    dq.addLast(ch);
                } else {
                    dq.addFirst(ch);
                }
            }
        }

        StringBuilder ans = new StringBuilder(dq.size());

        if (!reversed) {
            for (char c : dq) ans.append(c);
        } else {
            Iterator<Character> it = dq.descendingIterator();
            while (it.hasNext()) ans.append(it.next());
        }

        return ans.toString();
    }
}