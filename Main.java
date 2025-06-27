


public class Main {

    public static void main(String[] args) {
//
//        LocalDateTime now = LocalDateTime.now();
//
//
//        int hour = now.getHour();
//        int min=now.getMinute();
//        System.out.println(hour);
//        System.out.println(min);
Doctor d1=new Doctor("Mohamed",975,150000.0,"Dermatology", (short) 6, (short) 12);
        Doctor d2=new Doctor("Salah",976,150000.0,"Orthopedics", (short) 12, (short) 18);
        Doctor d3=new Doctor("Ali",977,150000.0,"Internal Medicine", (short) 18, (short) 0);
        Doctor d4=new Doctor("Sara",978,150000.0,"Obstetrics and Gynecology", (short) 0, (short) 6);
        Patients p1=new Patients("Ahmed","Obstetrics and Gynecology",50);
            Patients p2=new Patients("karem","Obstetrics and Gynecology",57);
            Patients p3=new Patients("amed","Obstetrics and Gynecology",70);
            Patients p4=new Patients("Noah","Dermatology",60);
            Nurse n1=new Nurse("Hosam",8234,15000);
            Nurse n2=new Nurse("halem",8235,15000);
            Nurse n3=new Nurse("salem",8236,15000);
            Nurse n4=new Nurse("mohsen",8274,15000);
medicine m1=new medicine("Mohsen","Dermatology",true);
            Admin a1=new Admin("Ryan",777,160000);
            a1.AddDoctors(d1);
        a1.AddDoctors(d2);
        a1.AddDoctors(d3);
        a1.AddDoctors(d4);
        a1.ShowDoctors();
        a1.AddPatients(p1);
            a1.AddPatients(p2);
            a1.AddPatients(p3);
            a1.AddPatients(p4);
            a1.Addmedicine(m1);
            n4.oTrackingmedical(p1);










    }}
