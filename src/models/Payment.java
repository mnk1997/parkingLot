package models;

import java.util.Date;

public class Payment extends BaseModel{
    private double amount;
    private PaymentStatus payStatus;
    private PaymentMode payMode;
    private String transactionId;
    private Date paymentDate;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPayStatus(PaymentStatus payStatus) {
        this.payStatus = payStatus;
    }

    public void setPayMode(PaymentMode payMode) {
        this.payMode = payMode;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentStatus getPayStatus() {
        return payStatus;
    }

    public PaymentMode getPayMode() {
        return payMode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }
}
