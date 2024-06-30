package models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int id;
    private List<VehicleType> vehicleSupported;
    private  ParkingSpotStatus status;
    private Vehicle vehicle;

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicleSupported(List<VehicleType> vehicleSupported) {
        this.vehicleSupported = vehicleSupported;
    }

    public void setStatus(ParkingSpotStatus status) {
        this.status = status;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public List<VehicleType> getVehicleSupported() {
        return vehicleSupported;
    }

    public ParkingSpotStatus getStatus() {
        return status;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
