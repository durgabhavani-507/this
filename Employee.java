1.public class Employee{
    String name;
    double salary;
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void setSalary(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name=" +this.name+",Salary="+this.salary);
    }
    public static void main(String []args){
        Employee obj=new Employee("durga",345678);
        obj.setSalary("bhavani", 123456);
        obj.display();
    }
}