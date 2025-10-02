public class CellPhone {

    private String owner;
    private String phoneNumber;
    private String serialNumber;
    private String carrier;
    private String model;

    public CellPhone() {
        this.owner = "";
        this.phoneNumber = "";
        this.serialNumber = "";
        this.carrier = "";
        this.model = "";
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setOwner(String n) {
        this.owner = n;
    }
    public String getOwner() {
        return this.owner;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }
}