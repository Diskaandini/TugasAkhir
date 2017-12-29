/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.Database;
import View.App;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.miv.mbox.Test;

/**
 *
 * @author VELIA
 */
public class DijkstraTest {
    private ArrayList<Vertex> nodes;
    private ArrayList<Segments> segment; 
    Connection conn = null;
    ResultSet rs ;
    PreparedStatement pstmt;
   
    public String testExcute(App app ) throws SQLException, ClassNotFoundException {
        nodes = new ArrayList<>();                
        segment = new ArrayList<Segments>();   
        
        for (int i = 0; i < segment.size(); i++) {
            Vertex location = new Vertex(" "+ i);
            nodes.add(location);
        }
        
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
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(app.getjComboYourLocation().getSelectedIndex()));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(app.getjComboDestinationObject().getSelectedIndex())); //get destination
     
        String isiReturn = "";
        
        for (int i = 0; i < path.size()-1; i++) {
            isiReturn += path.get(i).getId()+ "->" + path.get(i+1).getId() + "\n";
        }
        
        return isiReturn;   
    }         
    
}