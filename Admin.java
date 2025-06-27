import java.time.LocalDateTime;
import java.util.*;

public class Admin extends Empolyee{


static Queue <Patients>patients=new LinkedList<>();

    public Admin(String name, int id, double salary) {
        super(name, id, salary);
    }
    void AddDoctors(Doctor d1){
        Hospital.doctors.add(d1);
    }
    void AddPatients(Patients pp) {
     //   String specialization = pp.Specialization;
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int min = now.getMinute();

        if (hour > 12 && hour < 18 ) { double x1=0;
            if (pp.Specialization == "Orthopedics") {
                patients.add(pp);
                System.out.println("You Added Success ");
                for (int i=0;i<patients.size();i++){

                    x1+=0.5;
                }

                System.out.println("Your Time to Inter to Doctor After : "+x1+" Hour");
                System.out.println("_______________________________________");
            } else {
                System.out.println("Not Available Now......");

            }
        }

        if (hour > 18 && hour <= 23){ double x1=0;
            if (pp.Specialization == "Internal Medicine") {
                patients.add(pp);
                System.out.println("You Added Success ");
                for (int i=0;i<patients.size();i++){

                    x1+=0.5;
                }

                System.out.println("Your Time to Inter to Doctor After : "+x1+" Hour");
                System.out.println("_______________________________________");
            }
            else {
            System.out.println("Not Available Now......");
            }

        }

        if(hour>=0&&hour<6){
            double x1=0;
            if (pp.Specialization=="Obstetrics and Gynecology"){
                patients.add(pp);
                System.out.println("You Added Success ");
                for (int i=0;i<patients.size();i++){

                    x1+=0.5;
                }

                System.out.println("Your Time to Inter to Doctor After : "+x1+" Hour");
                System.out.println("_______________________________________");
            }
            else {
                System.out.println("Not Available Now......");
            }
        }

        if(hour>=6&&hour<12){
            double x1=0;
            if(pp.Specialization=="Dermatology")
            {
                patients.add(pp);
                System.out.println("You Added Success ");
                for (int i=0;i<patients.size();i++){

                    x1+=0.5;
                }

                System.out.println("Your Time to Inter to Doctor After : "+x1+" Hour");
                System.out.println("_______________________________________");
            }
            else {
                System.out.println("Not Available Now......");
            }

        }


    }
    void ShowDoctors(){


        for (int i=0;i< Hospital.doctors.size();i++) {
            Doctor d3= (Doctor)  Hospital.doctors.get(i);
            d3.ShowDetails();
            System.out.println("_________________Doctor Details_____________");
        }
    }

void Addmedicine(medicine m1){
        Hospital.medicines.add(m1);
    System.out.println("Done It");
    System.out.println("___________________________________________");
}




    }








