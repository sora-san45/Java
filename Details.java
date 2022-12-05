
    
class Employee{
    String name;
    int age;
    long phone;
    String address;
    float salary;

    Employee(String n,int a,long p,String ad,float s){
        name=n;
        age=a;
        phone=p;
        address=ad;
        salary=s;
    }
    void print_sal(){
        System.out.println(salary);
    }
}

class Officer extends Employee{
    String specialization;
    Officer(String n,int a,long p,String ad,float s,String specs){
        super(n,a,p,ad,s);
        specialization=specs;
    }
    void printDetails(){
        System.out.print("\nName = "+ name +"\nAge = "+age+"\nPhone number = "+phone+"\nAddress = "+address+"\nSpecialization"+specialization+"\nSalary = ");
    }
}
class Manager extends Employee{
    String department;
    Manager(String n,int a,long p,String ad,float s,String dept){
        super(n,a,p,ad,s);
        department=dept;
    }
    void printDetails(){
        System.out.print("\nName = "+ name +"\nAge = "+age+"\nPhone number = "+phone+"\nAddress = "+address+"\nDepartment"+department+"\nSalary = ");
    }
}
public class Details {
    public static void main(String[] args){
        Officer of = new Officer("Rahul",20,1234567891,"XYZ Street, Delhi, India",665656,"Cloud");
        of.printDetails();
        of.print_sal();
        Manager ma = new Manager("Kiran",20,1231231231,"ABC House, New York, USA",686856,"HR");
        ma.printDetails();
        ma.print_sal();
    }
    
}
