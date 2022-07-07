// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;
class Employee{
    int id;
    int salary;
    String email;
    String name;
    public Employee(int id,String name,int salary,String email){
        this.id=id;
        this.name=name;
        this.email=email;
        this.salary=salary;
    }
    public int getSalary(){
        return this.salary;
    }
    public String getEmail(){
        return this.email;
    }
    public String getName(){
        return this.name;
    }
}

class HelloWorld {
    public static void main(String[] args) {
         List<Employee> em=new ArrayList();
        Employee e1=new Employee(1,"Rajan",2000,"Rajan@gmail.com");
        Employee e2=new Employee(2,"Pratik",2000,"Pratik@gmail.com");
        Employee e3=new Employee(3,"Rahul",3000,"Rahul@gmail.com");
        Employee e4=new Employee(4,"Nilesh",4000,"Nilesh@gmail.com");
        em.add(e1);
        em.add(e2);
        em.add(e3);
        em.add(e4);
        List<Employee> lm=em.stream().sorted((a1,a2)->{
            if(a1.getSalary()==a2.getSalary()){
            if((int)(a1.getEmail().charAt(0))<(int)(a2.getEmail().charAt(0))){
                return 1;
            }
            else{
                
                return -1;
            }
            }
            return a1.getSalary()-a2.getSalary();
        }).collect(Collectors.toList());
        for(Employee e:lm)
System.out.println(e.getName()); 
       




    }
}