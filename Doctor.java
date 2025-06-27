import java.util.LinkedList;
import java.util.Queue;

public class Doctor extends Empolyee{
    String Specialization;
    short StartTime;
    short EndTime;

    public Doctor(String name, int id, double salary, String specialization, short startTime, short endTime) {
        super(name, id, salary);
        Specialization = specialization;
        StartTime = startTime;
        EndTime = endTime;
    }
    void ShowDetails(){
        super.ShowDetails();
        System.out.println("Specialization: "+Specialization);
        System.out.println("StartTime: " +StartTime);
        System.out.println("EndTime: "+EndTime);
    }









}
