class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public String getPermutation(int n, int k) {

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        backtrack(nums, new ArrayList<>(), new boolean[n]);

        List<Integer> ans = res.get(k - 1);

        StringBuilder sb = new StringBuilder();
        for (int num : ans) {
            sb.append(num);
        }

        return sb.toString();
    }

    private void backtrack(List<Integer> nums, List<Integer> temp, boolean[] used) {

        if (temp.size() == nums.size()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {

            if (used[i]) continue;

            used[i] = true;
            temp.add(nums.get(i));

            backtrack(nums, temp, used);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}