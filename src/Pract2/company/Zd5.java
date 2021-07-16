package Pract2.company;

//.Задание 5
//Реализуйте класс «Книга». Необходимо хранить в по-
//лях класса: название книги, ФИО автора, год выпуска,
//название издательства, жанр книги, количество страниц.
//  Реализуйте конструкторы и методы класса для ввода
//данных, вывода данных, реализуйте доступ к отдельным
//полям через методы класса. Используйте механизм пере-
//грузки методов.
public class Zd5 {
    protected  String Name;
    protected  String Authors;
    protected int  Year;
    protected  String Name_Izdat;
    protected String Zhanr;
    protected int Saz;

    public Zd5(String Name,String Authors,int  Year,String Name_Izdat,String Zhanr,int Saz) {
        this.Name = Name;
        this.Authors=Authors;
        this.Year = Year;
        this.Name_Izdat = Name_Izdat;
        this.Zhanr = Zhanr;
        this.Saz = Saz;

    }

    public Zd5() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String autors) {
        Authors = autors;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getName_Izdat() {
        return Name_Izdat;
    }

    public void setName_Izdat(String name_Izdat) {
        Name_Izdat = name_Izdat;
    }

    public String getZhanr() {
        return Zhanr;
    }

    public void setZhanr(String zhanr) {
        Zhanr = zhanr;
    }

    public int getSaz() {
        return Saz;
    }

    public void setSaz(int saz) {
        Saz = saz;
    }

    @Override
    public String toString() {
        return "Zd5{" +
                "Name='" + Name + '\'' +
                ", Authors='" + Authors + '\'' +
                ", Year=" + Year +
                ", Name_Izdat='" + Name_Izdat + '\'' +
                ", Zhanr='" + Zhanr + '\'' +
                ", Saz=" + Saz +
                '}';
    }
}

