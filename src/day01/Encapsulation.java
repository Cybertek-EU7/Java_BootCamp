package day01;

class Employee{

    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            throw new RuntimeException("Invalid salary: "+salary);
        }

        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.trim().isEmpty()){
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class Encapsulation {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
       // employee1.name = "";
      //  employee1.salary = -100000;

        employee1.setSalary(-100);

        System.out.println(employee1);




    }

}
