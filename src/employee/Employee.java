package employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }


    public String getName(){
        return firstName + lastName;
    }

    public double getAnnualSalary(){
        return salary * 12;
    }

    public double raiseSalary(double percent){
        return salary * (1 + (percent / 100));
    }

    public String toString(){
        return "Employee[id: "+id+", name: "+firstName + lastName+", salary: "+salary + "]" ;
    }

    public Employee(int id, String firstName, String lastName, int salary){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }

}
