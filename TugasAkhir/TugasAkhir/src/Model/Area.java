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
public class Area {
    private String areaName;
    private ArrayList<Building> buildingList;
    private ArrayList<Corridor> corridorList;

    public Area(String areaName) {
        this.areaName = areaName;
        buildingList = new ArrayList<>();
        corridorList = new ArrayList<>();
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setBuildingList(ArrayList<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public void addBuilding(String IDBuilding, String name, int floor){
        this.buildingList = buildingList;
    }

    public void addCorridor(String corridor_ID, String building_ID, String roofed, Double x, Double y, Double z, Latitude lati, Longitude longi) {
        this.corridorList.add(new Corridor(corridor_ID, building_ID, roofed, x, y, z, lati, longi));
    }

    public void setCorridorList(ArrayList<Corridor> corridorList) {
        this.corridorList = corridorList;
    }

    public String getAreaName() {
        return areaName;
    }

    public ArrayList<Building> getBuildingList() {
        return buildingList;
    }

    public ArrayList<Corridor> getCorridorList() {
        return corridorList;
    }

    public Building getBuilding(String idBuilding) {
        int idx = 0;
        while (!buildingList.get(idx).getIDBuilding().equals(idBuilding)) {
            idx++;            
        }
        return buildingList.get(idx);
    }

    
}
