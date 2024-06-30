package models;

import java.util.List;

public class ParkingLot extends BaseModel{
    List<ParkingFloor> floorList;
    List<Gate> gates;


    public void setFloorList(List<ParkingFloor> floorList) {
        this.floorList = floorList;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<ParkingFloor> getFloorList() {
        return floorList;
    }

    public List<Gate> getGates() {
        return gates;
    }
}
