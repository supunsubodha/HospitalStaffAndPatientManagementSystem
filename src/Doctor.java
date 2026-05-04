public class Doctor extends MedicalStaff{
    protected double consultationFee;
    protected int numberOfConsultations;

    public Doctor(String staffId, String name, double baseSalary, double consultationFee,int numberOfConsultations) {
        super(staffId,name,baseSalary);
        this.consultationFee = consultationFee;
        this.numberOfConsultations = numberOfConsultations;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+(consultationFee*numberOfConsultations);
    }
}
