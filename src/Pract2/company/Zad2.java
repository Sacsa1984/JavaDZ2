package Pract2.company;
//Задание 2
//        К уже реализованному классу «Город» добавьте необходимые конструкторы, а также необходимые перегруженные методы
public class Zad2 {

   protected String Name;
    protected String Region;
    protected    String Strana_Name;
    protected double Saiz_Piopl;    //задаёться в тисячях
    protected   int Index;
    public Zad2() {
    }

    public Zad2(String Name,String Region,String Strana_Name,double Saiz_Piopl,int index) {
       this.Name = Name;
       this.Region = Region;
       this.Strana_Name = Strana_Name;
       this.Saiz_Piopl = Saiz_Piopl;
       this.Index = index;
    }


    public double getSaiz_Piopl() {
        return Saiz_Piopl;
    }

    public void setSaiz_Piopl(double saiz_Piopl) {
        Saiz_Piopl = saiz_Piopl;
    }



    public int getIndex() {
        return Index;
    }

    public void setIndex(int index) {
        Index = index;
    }



    public String getStrana_Name() {
        return Strana_Name;
    }

    public void setStrana_Name(String strana_Name) {
        Strana_Name = strana_Name;
    }




    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    @Override
    public String toString() {
        return "Zad2{" +
                "Name='" + Name + '\'' +
                ", Region='" + Region + '\'' +
                ", Strana_Name='" + Strana_Name + '\'' +
                ", Saiz_Piopl=" + Saiz_Piopl +
                ", Index=" + Index +
                '}';
    }
}
