public class CellPhone {

    private String owner;
    private String phoneNumber;
    private String serialNumber;
    private String carrier;
    private String model;   // <-- you forgot this field

    public CellPhone() {
        this.owner = "";
        this.phoneNumber = "";
        this.serialNumber = "";
        this.carrier = "";
        this.model = "";
    }

    // Model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    // Phone Number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Owner
    public void setOwner(String n) {
        this.owner = n;
    }

    public String getOwner() {
        return this.owner;
    }

    // Carrier
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier() {
        return this.carrier;
    }

    // Serial Number
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }
}