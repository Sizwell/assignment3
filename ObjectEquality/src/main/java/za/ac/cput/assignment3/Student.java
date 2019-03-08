package za.ac.cput.assignment3;

import java.util.Objects;

public class Student {

    private String stud_num;
    private String stud_name;
    private String stud_Surname;
    private String stud_phone;
    private String stud_addr;

    private Student()
    {

    }


    public String getStudNum()
    {
        return stud_num;
    }

    public String getStudName()
    {
        return stud_name;
    }

    public String getStudSurname()
    {
        return stud_Surname;
    }

    public String getStudPhone()
    {
        return stud_phone;
    }

    public String getStudAddress()
    {
        return stud_addr;
    }

    public static class Builder
    {
        private String stud_num;
        private String stud_name;
        private String stud_Surname;
        private String stud_phone;
        private String stud_addr;

        public Builder stud_num(String num)
        {
            this.stud_num = num;
            return this;
        }

        public Builder stud_name(String name)
        {
            this.stud_name = name;
            return this;
        }

        public Builder stud_Surname(String surname)
        {
            this.stud_Surname = surname;
            return this;
        }

        public Builder stud_phone(String phone)
        {
            this.stud_phone = phone;
            return this;
        }

        public Builder stud_address(String address)
        {
            this.stud_addr = address;
            return this;
        }

        /*
        public Employee build()
        {
            return new Employee(this);
        }
         */


        public Student build()
        {
            return new Student(this);
        }

    }

    public Student (Builder builder)
    {
        this.stud_num = builder.stud_num;
        this.stud_name = builder.stud_name;
        this.stud_Surname = builder.stud_Surname;
        this.stud_phone = builder.stud_phone;
        this.stud_addr = builder.stud_addr;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stud_num.equals(student.stud_num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stud_num);
    }
}
