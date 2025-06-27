public class medicine {
    String Name;
    String MedicineKind;
    boolean isAvailable;

    public medicine(String name, String medicineKind, boolean isAvailable) {
        Name = name;
        MedicineKind = medicineKind;
         this.isAvailable=isAvailable;
    }
    void ShowDetails(){
        System.out.println("Name : "+Name);
        System.out.println("MedicineKind : "+MedicineKind);
    }



}
