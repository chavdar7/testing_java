package employee;

public class Main {
    public static void  main(String[] args){

        Employee em1 = new Employee(1,"furkan","cavdar",2000);
        System.out.println(em1);

        em1.setSalary(10000);
        System.out.println("em1 fname: " + em1.getFirstName());
        System.out.println("em1 lname: " + em1.getLastName());
        System.out.println("em1 id: " + em1.getId());
        System.out.println("em1 salary: " + em1.getSalary());

        System.out.println("em1 fullname: "+ em1.getName());
        System.out.println("em1 annual salary: " + em1.getAnnualSalary());

        em1.setSalary(em1.raiseSalary(20));
        System.out.println("em1 new salary: " + em1.getSalary());
        System.out.println("em1 new annual salary: " + em1.getAnnualSalary());






    }
}
