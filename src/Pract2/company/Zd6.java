package Pract2.company;//Задание 6
//        Реализуйте класс «Автомобиль». Необходимо хранить
//        в полях класса: название автомобиля, название производи-
//        теля, год выпуска, объём двигателя. Реализуйте конструк-
//        торы и методы класса для ввода данных, вывода данных,
//        реализуйте доступ к отдельным полям через методы класса.
//        Используйте механизм перегрузки методов.


import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zd6 {
    protected String Name;
    protected String Name_Proizvo;
    protected int Year;
    protected String V;

    public Zd6(String Name,String Name_Proizvo,int Year,String V) {
       this.Name = Name;
       this.Name_Proizvo=Name_Proizvo;
       this.Year=Year;
       this.V=V;

    }

    public Zd6() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName_Proizvo() {
        return Name_Proizvo;
    }

    public void setName_Proizvo(String name_Proizvo) {
        Name_Proizvo = name_Proizvo;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getV() {
        return V;
    }

    public void setV(String v) {
        V = v;
    }

    @Override
    public String toString() {
        return "Zd6{" +
                "Name='" + Name + '\'' +
                ", Name_Proizvo='" + Name_Proizvo + '\'' +
                ", Year=" + Year +
                ", V='" + V + '\'' +
                '}';
    }
}
