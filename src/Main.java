//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        MedicalStaff[] staff = new MedicalStaff[4];
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

        Doctor d1 = new Doctor("D001", "Dr. Nimal Fernando", 5000, 300, 10);
        Doctor d2 = new Doctor("D002", "Dr. Nimal Fernando", 5500, 350, 10);
        Nurse n1 = new Nurse("N001", "Nurse Ana Mendis",3000,40);
        Nurse n2 = new Nurse("N002", "Nurse Kumari Perera",2800,35);

        staff[0] = d1;
        staff[1] = d2;
        staff[2] = n1;
        staff[3] = n2;

        for (MedicalStaff ms : staff) {
            ms.printPlayslip();
        }




    }
}