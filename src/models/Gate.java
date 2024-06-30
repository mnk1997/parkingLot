package models;

public class Gate extends BaseModel{
    private GateType type;
    private GateStatus status;
    private Operator operator;
    private String gateNumber;

    public void setType(GateType type) {
        this.type = type;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getType() {
        return type;
    }

    public GateStatus getStatus() {
        return status;
    }

    public Operator getOperator() {
        return operator;
    }

    public String getGateNumber() {
        return gateNumber;
    }
}
