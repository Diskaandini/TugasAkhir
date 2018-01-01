/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.Database;
import View.App;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.graphstream.graph.Edge;
import org.graphstream.graph.EdgeFactory;
import org.graphstream.graph.EdgeRejectedException;
import org.graphstream.graph.ElementNotFoundException;
import org.miv.mbox.Test;
import org.graphstream.graph.Graph;
import org.graphstream.graph.IdAlreadyInUseException;
import org.graphstream.graph.Node;
import org.graphstream.graph.NodeFactory;
import org.graphstream.stream.AttributeSink;
import org.graphstream.stream.ElementSink;
import org.graphstream.stream.GraphParseException;
import org.graphstream.stream.Sink;
import org.graphstream.stream.file.FileSink;
import org.graphstream.stream.file.FileSource;
import org.graphstream.ui.swingViewer.Viewer;

/**
 *
 * @author VELIA
 */
public class DijkstraTest {
    private Graph graph;
    private ArrayList<Vertex> nodes;
    private ArrayList<Segments> segment; 
    Connection conn = null;
    ResultSet rs ;
    PreparedStatement pstmt;
   
    public String testExcute(App app, String room_code) throws SQLException, ClassNotFoundException {
        segment = new ArrayList<Segments>();       
        
        String sql = "select * from segments";
        conn = Database.ConnectDB();
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            Vertex source = new Vertex(rs.getString("Source"));
            Vertex destionation = new Vertex(rs.getString("Destination"));
            Segments sgm = new Segments(rs.getString("No"), source, destionation, rs.getDouble("Length"));
            segment.add(sgm);
        }
        
        // check from location qp to destination    
               
        Graph graph = new Graph(nodes, segment);
//        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
//        dijkstra.execute(nodes.get(app.getjComboYourLocation().getSelectedIndex()));
//        dijkstra.execute(nodes.get(0)); //get qp
//        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(11)); //get destination
     
        String isiReturn = "";
        
        for (int i = 0; i < segment.size(); i++) {
            isiReturn += segment.get(i).getSource().getId()+ "->" + segment.get(i).getDestination().getId() + "\n";
        }

        return isiReturn;
    }

    public String testExcute(App aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
