class Employee {
    private static int idGenerator = 1;
    private int id;
    private String FullName;
    private int department;
    private int salary;


    public Employee(String FullName, int  department, int salary){
        id = idGenerator++;
        this.FullName = FullName;
        this.department = department;
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public String getFullName() {

        return FullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }
}
