import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    private void backtrack(List<String> result, StringBuilder currentCombination, int openCount, int closeCount, int maxPairs) {
        if (currentCombination.length() == 2 * maxPairs) {
            result.add(currentCombination.toString());
            return;
        }
        if (openCount < maxPairs) {
            currentCombination.append("(");
            backtrack(result, currentCombination, openCount + 1, closeCount, maxPairs);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
        if (closeCount < openCount) {
            currentCombination.append(")");
            backtrack(result, currentCombination, openCount, closeCount + 1, maxPairs);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }
}