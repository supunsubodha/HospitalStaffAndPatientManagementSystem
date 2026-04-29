public class Staff {
    public static final String HOSPITAL_NAME = "City General Hospital";
    public static final int MAX_WARD_CAPACITY = 30;
    private static  int staffCount = 0;
    String staffId;
    String staffName;
    String department;

    public Staff(String staffId, String staffName, String department) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.department = department;
        staffCount++;
    }
    public static void displayHospitalInfo() {
        System.out.println("---Hospital Info---");
        System.out.println("Hospital : " + HOSPITAL_NAME);
        System.out.println("Staff count: " + staffCount);
    }
    public void displayStaff(){
        System.out.println("["+staffId+"] "+staffName+"-"+department);
    }
}
