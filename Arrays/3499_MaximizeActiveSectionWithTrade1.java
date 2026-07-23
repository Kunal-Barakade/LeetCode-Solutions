class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        List<Integer> zeroGroups = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                ones++;
                i++;
            } else {
                int len = 0;
                while (i < s.length() && s.charAt(i) == '0') {
                    len++;
                    i++;
                }
                zeroGroups.add(len);
            }
        }

        int maxGain = 0;
        for (int j = 0; j < zeroGroups.size() - 1; j++) {
            maxGain = Math.max(maxGain, zeroGroups.get(j) + zeroGroups.get(j + 1));
        }

        return ones + maxGain;
    }
}