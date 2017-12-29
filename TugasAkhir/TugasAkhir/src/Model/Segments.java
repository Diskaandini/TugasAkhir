/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author VELIA
 */
public class Segments {
    private String no;
    private Vertex source;
    private Vertex destination;
    private Double length;

    public Segments(String no, Vertex source, Vertex destination, Double length) {
        this.no = no;
        this.source = source;
        this.destination = destination;
        this.length = length;
    }    

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getDestination() {
        return destination;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    
    public Double measureDistance(Double lat1, Double lon1, Double lat2, Double lon2) {  // generally used geo measurement function
        Double r = 6378.137; // Radius of earth in KM
        Double dLat = lat2 * Math.PI / 180 - lat1 * Math.PI / 180;
        Double dLon = lon2 * Math.PI / 180 - lon1 * Math.PI / 180;
        Double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(lat1 * Math.PI / 180) * Math.cos(lat2 * Math.PI / 180)
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        Double d = r * c;
        return d * 1000; // meters
    }
    
    @Override
    public String toString() {
        return source + " " + destination;
    }    
       
}
