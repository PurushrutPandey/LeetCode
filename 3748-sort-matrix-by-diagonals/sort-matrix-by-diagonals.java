
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer, List<Integer>> diagonals = new HashMap<>();
        int n = grid.length;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int key = r - c;
                diagonals.putIfAbsent(key, new ArrayList<>());
                diagonals.get(key).add(grid[r][c]);
            }
        }

        for (int key : diagonals.keySet()) {
            List<Integer> list = diagonals.get(key);
            if (key >= 0) {
                list.sort(Collections.reverseOrder());
            } else {
                Collections.sort(list);
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int key = r - c;
                List<Integer> list = diagonals.get(key);
                grid[r][c] = list.remove(0);
            }
        }

        return grid;
    }
}
