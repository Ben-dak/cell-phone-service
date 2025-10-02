public class CellPhoneApplication {

    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();

        phone1.setOwner("Dominick");
        phone1.setModel("Galaxy S23+");  // ✅ use the instance method, not class method

        System.out.println("phone 1 owner: " + phone1.getOwner());
        System.out.println("phone 1 model: " + phone1.getModel());  // ✅ test model too
    }
}
