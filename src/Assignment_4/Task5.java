package Assignment_4;

import java.util.*;

public class Task5 {

    public static void main(String[] args){
        Map<String, List<Edge>> graph = new HashMap<>();
        String[] cities = {"Edinburgh","Glasgow","Stirling","Perth","Dundee"};
        for(String city : cities){
            graph.put(city, new ArrayList<>());
        }

        addEdge(graph,"Edinburgh","Glasgow",70);
        addEdge(graph, "Edinburgh", "Stirling", 50);
        addEdge(graph, "Glasgow", "Stirling", 50);
        addEdge(graph, "Edinburgh", "Perth", 100);
        addEdge(graph, "Perth", "Dundee", 60);
        addEdge(graph, "Perth", "Stirling", 40);

        dijkstra("Edinburgh","Dundee",graph);
    }

    static class Edge{
        String target;
        int weight;
        Edge(String target, int weight){
            this.target=target;
            this.weight=weight;
        }
    }
    static class Node implements Comparable<Node>{
        String name;
        int distance;
        Node(String name,int distance){
            this.name = name;
            this.distance = distance;
        }
        @Override
        public int compareTo(Node other){
            return Integer.compare(this.distance,other.distance);
        }
    }

    static void addEdge(Map<String, List<Edge>> graph, String city1, String city2,int weight){
        graph.get(city1).add(new Edge(city2,weight));
        graph.get(city2).add(new Edge(city1,weight));
    }

    static void dijkstra(String start, String destination, Map<String, List<Edge>> graph){
        Map<String, Integer> distTo = new HashMap<>();
        Map<String,String> edgeTo = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for(String city: graph.keySet()){
            distTo.put(city,Integer.MAX_VALUE);
        }
        distTo.put(start,0);
        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            if(current.distance>distTo.get(current.name)){
                continue;
            }
            for(Edge edge : graph.get(current.name)){
                String neighbor = edge.target;
                int newDist = distTo.get(current.name)+edge.weight;
                if(newDist<distTo.get(neighbor)){
                    distTo.put(neighbor, newDist);
                    edgeTo.put(neighbor, current.name);
                    pq.add(new Node(neighbor,newDist));
                }
            }
        }
        System.out.println("Shortest distance from "+ start+" to "+ destination + ": "+ distTo.get(destination));
        List <String> path = new ArrayList<>();
        String step = destination;
        while(step!=null){
            path.add(step);
            step=edgeTo.get(step);
        }
        Collections.reverse(path);
        System.out.print("Path: ");
        System.out.println(path);
    }
}
