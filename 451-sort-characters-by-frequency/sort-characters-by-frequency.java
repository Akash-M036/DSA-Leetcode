class Solution {
    static class Val {
        char c;
        int count;
        Val(char c, int count) {
            this.c = c;
            this.count = count;
        }
    }

    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Val> pq = new PriorityQueue<>((a, b) -> b.count - a.count);

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            pq.add(new Val(entry.getKey(), entry.getValue()));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Val current = pq.poll();
            for (int i = 0; i < current.count; i++) {
                sb.append(current.c);
            }
        }

        return sb.toString();
    }
}
