// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Employee{
    int id;
    int salary;
    
    
    public Employee(int id,int name){
        this.id=id;
        this.salary=name;
    }
    public int getSalary(){
        return this.salary;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        
        List<Employee> i=new ArrayList();
        i.add(new Employee(1,15000));
        i.add(new Employee(1,4500));
        i.add(new Employee(1,7500));
        i.add(new Employee(1,1700));
        i.add(new Employee(1,20000));
        i.add(new Employee(1,5500));
        //Last third salary
        Optional<Employee> ne=i.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println(ne.get().getSalary());
    }
}
