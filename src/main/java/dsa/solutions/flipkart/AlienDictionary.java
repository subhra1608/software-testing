package dsa.solutions.flipkart;

import java.util.*;

public class AlienDictionary {
    public static String alienOrder(String[] words) {
        // Create the adjacency list and in-degree map
        Map<Character, List<Character>> adjList = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        // Initialize the graph
        for (String word : words) {
            for (char c : word.toCharArray()) {
                adjList.putIfAbsent(c, new ArrayList<>());
                inDegree.putIfAbsent(c, 0);
            }
        }

        // Build the graph by comparing adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String first = words[i];
            String second = words[i + 1];
            int minLength = Math.min(first.length(), second.length());

            boolean foundDifference = false;
            for (int j = 0; j < minLength; j++) {
                char from = first.charAt(j);
                char to = second.charAt(j);
                if (from != to) {
                    adjList.get(from).add(to);
                    inDegree.put(to, inDegree.get(to) + 1);
                    foundDifference = true;
                    break;
                }
            }

            // If no difference and second word is a prefix of the first, invalid input
            if (!foundDifference && first.length() > second.length()) {
                return "";
            }
        }

        // Perform topological sort (Kahn's Algorithm)
        Queue<Character> queue = new LinkedList<>();
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                queue.offer(c);
            }
        }

        StringBuilder order = new StringBuilder();
        while (!queue.isEmpty()) {
            char current = queue.poll();
            order.append(current);

            for (char neighbor : adjList.get(current)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If all characters are not in the order, there's a cycle
        if (order.length() != adjList.size()) {
            return "";
        }

        return order.toString();
    }
}
