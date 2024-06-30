package models;

public class Vehicle extends BaseModel{
    private String ownerName;
    private String numberPlate;
    private VehicleType type;

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public VehicleType getType() {
        return type;
    }
}
