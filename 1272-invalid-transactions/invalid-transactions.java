class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        List<String> ans = new ArrayList<>();
        String[] names = new String[n];
        int[] times = new int[n];
        int[] amounts = new int[n];
        String[] cities = new String[n];
        for (int i = 0; i < n; i++) {
            String[] parts = transactions[i].split(",");
            names[i] = parts[0];
            times[i] = Integer.parseInt(parts[1]);
            amounts[i] = Integer.parseInt(parts[2]);
            cities[i] = parts[3];
        }
        for (int i = 0; i < n; i++) {
            if (amounts[i] > 1000) {
                ans.add(transactions[i]);
                continue;
            }
            boolean invalid = false;
            for (int j = 0; j < n; j++) {
                if (i != j && names[i].equals(names[j]) && !cities[i].equals(cities[j])) {
                    if (Math.abs(times[i] - times[j]) <= 60) {
                        invalid = true;
                        break;
                    }
                }
            }
            
            if (invalid) {
                ans.add(transactions[i]);
            }
        }
        return ans;
    }
}
