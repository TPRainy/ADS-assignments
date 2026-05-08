package Assignment_4;

import java.util.*;

public class Task3 {
    public static void main(String[] args){
        Map<Character, List<Character>> graph = new LinkedHashMap<>();
        graph.put('A', Arrays.asList('C','B','D'));
        graph.put('B', Arrays.asList('A', 'C', 'E', 'G'));
        graph.put('C', Arrays.asList('A', 'B', 'D'));
        graph.put('D', Arrays.asList('C', 'A'));
        graph.put('E', Arrays.asList('G', 'F', 'B'));
        graph.put('F', Arrays.asList('G', 'E'));
        graph.put('G', Arrays.asList('F', 'B'));

        System.out.print("DFS Order: ");
        Set<Character> visitedDPS = new LinkedHashSet<>();
        dfs('A', graph, visitedDPS);
        System.out.print('\n');

        System.out.print("BFS Order: ");
        bfs('A',graph);
    }
    public static void dfs(Character node, Map<Character, List<Character>> graph,Set<Character> visited){
        visited.add(node);
        System.out.print(node+" ");

        for (Character neighbor :graph.get(node)){
            if(!visited.contains(neighbor)){
                dfs(neighbor,graph,visited);
            }
        }
    }

    public static void bfs(Character startNode, Map<Character, List<Character>> graph){
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        visited.add(startNode);
        queue.add(startNode);

        while (!queue.isEmpty()){
            Character current = queue.poll();
            System.out.print(current+" ");
            for(Character neighbor : graph.get(current)){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
