import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N皇后 {
    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        solve(new ArrayList<String>(), n, 0, 0, 0);
        return result;
    }

    private void solve(List<String> res, int n, int shu, int pia, int na) {
        if (res.size() == n) {
            result.add(new ArrayList<>(res));
            return;
        }
        int cur = ((1 << n) - 1) & ~(shu | pia | na);
        while (cur != 0) {
            int p = cur & (-cur);
            char[] chars = new char[n];
            Arrays.fill(chars, '.');
            chars[Integer.toBinaryString(p).length() - 1] = 'Q';

            res.add(new String(chars));
            solve(res, n, shu | p, (pia | p) << 1, (na | p) >> 1);
            res.remove(res.size() - 1);

            cur = cur & (cur - 1);
        }
    }
}
