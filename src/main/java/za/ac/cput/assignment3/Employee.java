package za.ac.cput.assignment3;

import java.util.Objects;

public class Employee {
    private String empId;
    private String empName;
    private String empSurname;
    private String address;

    private Employee()
    {

    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public String getAddress(){
        return address;
    }

    public static class Builder
    {

        private String empId;
        private String empName;
        private String empSurname;
        private String address;

        public Builder empId(String value)
        {
            this.empId = value;
            return this;
        }
        public Builder empName(String value)
        {
            this.empName = value;
            return this;
        }
        public Builder empSurname(String value)
        {
            this.empSurname = value;
            return this;

        }

        public Builder empAddress(String value){
            this.empSurname = value;
            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

    }

    public Employee(Builder builder)
    {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
        this.address = builder.address;


    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee student = (Employee) o;
        return empId.equals(student.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}
