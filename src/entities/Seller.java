package entities;
import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
    private Integer id;
    private String name;
    private String email;
    private Date birthDate;
    private Double salary;
    private Department department;

    public Seller(){}

    public  Seller(Integer id, String name, String email, Date birthDate, Double salary, Department department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.birthDate = birthDate;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + (((id == null) ? 0 : id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Department other = (Department) obj;
        if (id == null) {
            if (other.getId() != null)
                return false;
        } else if (id.equals(other.getId()))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "Retorno";
    }
}
