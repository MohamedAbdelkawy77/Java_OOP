import java.util.Random;
public class Nurse extends Empolyee{

    public Nurse(String name, int id, double salary) {
        super(name, id, salary);
    }



    void oTrackingmedical(Patients p1){
        Random random = new Random();
        int min = 1;
        int max = 24;
        int randomInt = random.nextInt(max - min + 1) + min;
        System.out.println("You Must Tack Your Medicine Every "+randomInt+"Hour");
        System.out.println("____________________________________");
    }




}
