public abstract class MedicalStaff {
    protected String staffId;
    protected String name;
    protected double baseSalary;

    public MedicalStaff(String staffId, String name, double baseSalary) {
        this.staffId = staffId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    void printPlayslip(){
        System.out.println("=== Payslip: "+name+"===");
        System.out.println("Staff ID:" + this.staffId);
        System.out.println("Base: " + this.baseSalary);
        System.out.println("Total: " + calculateSalary());
        System.out.println();
    }

}
