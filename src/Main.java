//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(1001,"Alice Brown", 35, "ICU", true);
        p1.printInfo();
        Patient p2 = new Patient(1002, "Bob perera");
        p2.setAge(47);
        p2.setWard("Cardiology");
        p2.printInfo();
        Staff.displayHospitalInfo();
        Staff s1 = new Staff("S001","Dr. Nimal Fernando", "Cardiology");
        Staff s2 = new Staff("S002", "Nurse Priya Perera", "ICU");
        Staff s3 = new Staff("S003","Dr. Amara Silva", "Neurology");
        Staff.displayHospitalInfo();


    }
}