class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);  // row 0 is always [1]

        for (int i = 1; i <= rowIndex; i++) {
            row.add(0);  // dummy value to expand size

            // update from end to start (to not overwrite needed values)
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}
