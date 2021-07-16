package Pract2.company;

public class Zad1 {


  //  К уже реализованному классу «Человек» добавьте
   // необходимые конструкторы, а также необходимые перегруженные методы.
    protected  String Name;
    protected String Famali;
    protected   String Ochestwo;
    protected   String Siti;
    protected  String Adres;
    protected   String Phone;

    public Zad1() {
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamali() {
        return Famali;
    }

    public void setFamali(String famali) {
        Famali = famali;
    }

    public String getOchestwo() {
        return Ochestwo;
    }

    public void setOchestwo(String ochestwo) {
        Ochestwo = ochestwo;
    }

    public String getSiti() {
        return Siti;
    }

    public void setSiti(String siti) {
        Siti = siti;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
  public  Zad1(String Name,String Famali,String Ochestwo,String Siti,String Adres,String Phone)
    {
        this.Name = Name;
        this.Famali =Famali;
        this.Ochestwo =Ochestwo;
        this.Siti =Siti;
        this.Adres =Adres;
        this.Phone =Phone;
    }


    @Override
    public String toString() {
        return "Zad1{" +
                "Name='" + Name + '\'' +
                ", Famali='" + Famali + '\'' +
                ", Ochestwo='" + Ochestwo + '\'' +
                ", Siti='" + Siti + '\'' +
                ", Adres='" + Adres + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
