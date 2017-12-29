/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author VELIA
 */
public class Graph {
    private final ArrayList<Vertex> vertexes;
    private final ArrayList<Segments> segments;

    public Graph(ArrayList<Vertex> vertexes, ArrayList<Segments> segments) {
        this.vertexes = vertexes;
        this.segments = segments;
    }

    public ArrayList<Vertex> getVertexes() {
        return vertexes;
    }
    
    public ArrayList<Segments> geSegmentses(){
        return segments;
    }

//    public ArrayList<Edge> getEdges() {
//        return edges;
//    }
}
