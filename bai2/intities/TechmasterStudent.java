package Ontap.buoi7.bai2.intities;

public abstract class TechmasterStudent {
    private String name;
    private String major;

    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();
    public String classify(){
      if (getScore()>=7.5)
          return "HSG";
      else if (getScore()<7.5 && getScore()>6.5) {
          return "HSK";
          
      }
      return "HSTB";

    };

    public void getInfo(){
        System.out.println("-----Thông tin sinh viên-----");
        System.out.println("Name: " + name);
        System.out.println("Ngành: " + major);
        System.out.println("Điểm: " + getScore());
        System.out.println("Xếp hạng: " + classify());

    };



}
