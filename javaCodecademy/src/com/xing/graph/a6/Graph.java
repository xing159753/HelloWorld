package com.xing.graph.a6;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted) {
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);

        return newVertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
        if (!this.isWeighted) {
            weight = null;
        }

        vertex1.addEdge(vertex2, weight);
        vertex2.addEdge(vertex1, weight);
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2) {
        vertex1.removeEdge(vertex2);
        vertex2.removeEdge(vertex1);
    }

    public void removeVertex(Vertex vertex) {
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getVertices() {
        return this.vertices;
    }

    public boolean isWeighted() {
        return this.isWeighted;
    }

    public Vertex getVertexByValue(String value) {
        for(Vertex v : this.vertices) {
            if (v.getData() == value) {
                return v;
            }
        }

        return null;
    }

    public void print() {
        for(Vertex v : this.vertices) {
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        Graph trainNetwork = new Graph(true);
        Vertex atlantaStation = trainNetwork.addVertex("Atlanta");
        Vertex newYorkStation = trainNetwork.addVertex("New York");

        trainNetwork.addEdge(atlantaStation, newYorkStation, 800);

        trainNetwork.print();
    }
}
