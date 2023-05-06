//package com.xing.traversal.a5;
//
//import java.util.ArrayList;
//
//public class GraphTraverser {
//    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
//        System.out.println(start.getData());
//
//        for (Edge e : start.getEdges()) {
//            Vertex neighbor = e.getEnd();
//
//            if (!visitedVertices.contains(neighbor)) {
//                visitedVertices.add(neighbor);
//                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
//            }
//        }
//    }
//
//    public static void breadthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
//        Queue visitQueue = new Queue();
//        visitedVertices.enqueue(start);
//
//        while (!visitedVertices.isEmpty()) {
//            Vertex current = visitedQueue.dequeue();
//            System.out.println(current.getData());
//
//            for (Edge e : current.getEdges()) {
//                Vertex neighbor = e.getEnd();
//                if (!visitedVertices.contains(neighbor)) {
//                    visitedQueue.enqueue(neighbor);
//                    visitedVertices.add(neighbor);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        TestGraph test = new TestGraph();
//        Vertex startingVertex = test.getStartingVertex();
//        ArrayList<Vertex> visitedVertices = new ArrayList<Vertex>();
//        visitedVertices.add(startingVertex);
//
//        GraphTraverser.breadthFirstTraversal(startingVertex, visitedVertices);
//    }
//}
