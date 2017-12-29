/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author VELIA
 */
public class NN {
    Connection conn = null;
    ResultSet rs=null;
    PreparedStatement pstmt = null;
    
    public String searchNearest(String qp, String dest) throws SQLException, ClassNotFoundException {
        conn = Database.ConnectDB(); 
        Double length;
        Double minLength;        
        String ansRoom="";
        
//        String qPoint = "select *from room where room_code = '" + qp +"';";
//        pstmt= conn.prepareStatement(qPoint);
//        rs = pstmt.executeQuery();
//        while (rs.next()){
//            if (!rs.getString("latitude_degree").isEmpty() || !rs.getString("longitude_degree").isEmpty()){
//                Latitude lati = new Latitude(Double.valueOf(rs.getString("latitude_degree")), Double.valueOf(rs.getString("latitude_minute")), Double.valueOf(rs.getString("latitude_second")), rs.getString("latitude_direction"));
//                Longitude longi = new Longitude(Double.valueOf(rs.getString("longitude_degree")), Double.valueOf(rs.getString("longitude_minute")), Double.valueOf(rs.getString("longitude_second")), rs.getString("longitude_direction"));
//                Room room = new Room(rs.getString("room_code"), rs.getString("room_name"), rs.getString("type"), rs.getDouble("x"), rs.getDouble("y"), rs.getDouble("z"), lati, longi);
//            }    
//        }
//        
//        String obj = "select * from room WHERE type LIKE '%" + dest + "%'";
//        pstmt= conn.prepareStatement(obj);
//        rs = pstmt.executeQuery();
//        while (rs.next()){
//            if (!rs.getString("latitude_degree").isEmpty() || !rs.getString("longitude_degree").isEmpty()){
//                Latitude lati = new Latitude(Double.valueOf(rs.getString("latitude_degree")), Double.valueOf(rs.getString("latitude_minute")), Double.valueOf(rs.getString("latitude_second")), rs.getString("latitude_direction"));
//                Longitude longi = new Longitude(Double.valueOf(rs.getString("longitude_degree")), Double.valueOf(rs.getString("longitude_minute")), Double.valueOf(rs.getString("longitude_second")), rs.getString("longitude_direction"));
//                Room room = new Room(rs.getString("room_code"), rs.getString("room_name"), rs.getString("type"), rs.getDouble("x"), rs.getDouble("y"), rs.getDouble("z"), lati, longi);
//            }    
//        }
//       
//        minLength = null;
      
//        System.out.println(obj);
//        
//        
               
//        for (int j = 0; j < destList.size() ; j++  ){
//            length = Math.sqrt(Math.pow(destList.get(j).getX() - initial.getX() ,2))
//                    +Math.pow(destList.get(j).getY()- initial.getY(),2)
//                    +Math.pow(destList.get(j).getZ()- initial.getZ(),2);
//            if (j==0) {
//                minLength = length;
//                ansRoom = destList.get(j).getRoom_name();
//            }            
//            else {
//                if (length<minLength) {
//                    minLength=length;
//                    ansRoom = destList.get(j).getRoom_name();
//                }
//            }
            //System.out.println(minLength);
//        }
            
//        System.out.println("Ruang Terdekat: " + ansRoom);
//        System.out.println("Jarak: " + minLength);
        return ansRoom;
        
    }
}
