public class Company {
    private String companyName;
    private String department;
    private double salary;


    public Company(String companyName, String department, double salary){
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getCompanyName() {
        return companyName;
    }
    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getCompanyName(), this.getDepartment(), this.getSalary());
    }
}
