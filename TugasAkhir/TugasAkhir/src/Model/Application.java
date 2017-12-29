/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author VELIA
 */
public class Application {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    ArrayList<Vertex> vertexlist = new ArrayList<>();     
    
    public ArrayList<Vertex> vertexList() throws SQLException{
        String qRoom= "select *from room";       
        pstmt = conn.prepareStatement(qRoom);
        rs = pstmt.executeQuery();
        while (rs.next()) {       
            vertexlist.add(new Vertex(rs.getString("room_code")));
        }
        String qCor= "select *from corridor";       
        pstmt = conn.prepareStatement(qCor);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            vertexlist.add(new Vertex(rs.getString("corridor_ID")));
        }
        String qSr= "select *from stair";       
        pstmt = conn.prepareStatement(qSr);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            vertexlist.add(new Vertex(rs.getString("stair_ID")));            
        }
        return vertexlist;
    }    
      
    
}
