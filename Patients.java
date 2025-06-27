public class Patients {
    String Name;
    String  Specialization;;
    int age;

    public Patients(String name, String  Specialization, int age) {
        Name = name;
        this. Specialization =  Specialization;
        this.age = age;
    }

    void GetDetails(){

        System.out.println("Person Name :  "+Name);
        System.out.println("Person  Specialization : "+ Specialization);
        System.out.println("Person Age : "+age);

    }


}
