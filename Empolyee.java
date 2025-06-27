public class Empolyee {
    String name;
    int id;
    double salary;

    public Empolyee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
 void ShowDetails(){
     System.out.println("Name: "+name);
     System.out.println("Id: " +id);
     System.out.println("Salary: "+salary);
 }


}
