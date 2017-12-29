/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author VELIA
 */
public class Building {
    private String IDBuilding;
    private String name;
    private Double floor;
    private ArrayList<Room> rooms;
    private ArrayList<Corridor> corridors;
    private ArrayList<Stair> stairs;
    
    public Building(String IDBuilding, String name, Double floor, ArrayList<Room> rooms, ArrayList<Corridor> corridors, ArrayList<Stair> stairs) {
        this.IDBuilding = IDBuilding;
        this.name = name;
        this.floor = floor;
        this.rooms = new ArrayList<>();
        this.corridors = new ArrayList<>();
        this.stairs = new ArrayList<>();
    }
        
    public void addRoom (String room_code, String room_name, String type, Double x, Double y, Double z, Latitude lati, Longitude longi){
        rooms.add(new Room(room_code, room_name, type, x, y, z, lati, longi));
    }
    
    public void addCorridor(String corridor_ID, String building_ID, String roofed, Double x, Double y, Double z, Latitude lati, Longitude longi){
        corridors.add(new Corridor(corridor_ID, building_ID, roofed, x, y, z, lati, longi));
    
    }

    public void addStairs(String stair_ID, Double x, Double y, Double z, Latitude lati, Longitude longi){
        stairs.add(new Stair(stair_ID, x, y, z, lati, longi));
    }
    
    public void setIDBuilding(String IDBuilding){
        this.IDBuilding = IDBuilding;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setFloor(Double floor) {
        this.floor = floor;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void setCorridors(ArrayList<Corridor> corridors) {
        this.corridors = corridors;
    }

    public void setStairs(ArrayList<Stair> stairs) {
        this.stairs = stairs;
    }
    
    public String getIDBuilding() {
        return IDBuilding;
    }

    public String getName() {
        return name;
    }

    public Double getFloor() {
        return floor;
    }

    public ArrayList<Room> getRoom() {
        return rooms;
    }

    public ArrayList<Corridor> getCorridor() {
        return corridors;
    }

    public ArrayList<Stair> getStairs() {
        return stairs;
    }
    
    
}
