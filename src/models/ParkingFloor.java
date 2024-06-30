package models;

import java.util.List;

public class ParkingFloor extends BaseModel{

    int floorNumber;
    List<ParkingLot> parkingLot;
    ParkingFloorStatus floorStatus;
}
