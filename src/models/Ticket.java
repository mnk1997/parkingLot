package models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Date entryTime;
    private ParkingFloor floor;
    private Operator operator;
    private Vehicle vehicle;

}
