public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String ward;
    private boolean isAdmitted;
    public Patient(int patientId, String name, int age, String ward, boolean isAdmitted) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.isAdmitted = isAdmitted;
    }
    public Patient(int patientId, String name){
        this.patientId = patientId;
        this.name = name;
        this.age = 0;
        this.ward = "General";
        this.isAdmitted = true;
    }
    public Patient setAge(int age) {
        return this;
    }
    public Patient setWard(String ward) {
        return this;
    }

    public void printInfo(){
        System.out.println("Patient ID: " + this.patientId + "| Name: "+ this.name);
        System.out.println("Age: "+this.age+"| Ward: "+this.ward +"| Admitted: "+this.isAdmitted);
        System.out.println();
    }


}
