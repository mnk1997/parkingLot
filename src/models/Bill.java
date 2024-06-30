package models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Ticket ticket;
    private Date exitTime;
    private Gate exitGate;
    private List<Payment> payments;// partial payment
    private BillStatus billStatus;

}
