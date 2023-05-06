//package com.xing.traversal.a3;
//
//import java.util.ArrayList;
//
//public class GraphTraverser {
//    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
//        System.out.println(start.getData());
//
//        for (Edge e : start.getEdge()) {
//            Vertex neighbor = e.getEnd();
//
//            if (!visitedVertices.contains(neighbor)) {
//                visitedVertices.add(neighbor);
//                GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
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
//        GraphTraverser.depthFirstTraversal(startingVertex, visitedVertices);
//    }
//}
