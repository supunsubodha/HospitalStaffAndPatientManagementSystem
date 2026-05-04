public class Nurse extends  MedicalStaff {
    protected int overTimeHours;

    public Nurse(String staffId, String name, double baseSalary, int overTimeHours) {
        super(staffId, name, baseSalary);
        this.overTimeHours = overTimeHours;
    }

    double calculateSalary() {
        return baseSalary +  (overTimeHours*15.0);
    }

}
