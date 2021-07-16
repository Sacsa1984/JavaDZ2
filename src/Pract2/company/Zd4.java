package Pract2.company;


import java.util.Arrays;
import java.util.Scanner;

//Создайте класс «Дробь». Необходимо хранить в полях
//        класса: числитель и знаменатель. Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ
//        к отдельным полям через методы класса. Также создайте
//        методы класса для выполнения арифметических операций
//        (сложение, вычитание, умножение, деление, и т.д.)
public class Zd4 {
    protected int[] y;//чеслитель
    protected int[] x;//знаменатель
    private int [] dan_Ches;//данные после сведения к общему знаменатилю
    private int [] dan_Znam;//данные после сведения к общему знаменатилю
    protected int [] sum;//результатт вычислений

    public Zd4(int[] y,int[] x) {
        this.y =new int[2];
        this.x =new int[2];
        dan_Znam=new int[2];
        dan_Ches=new int[2];
        sum=new int[2];
        this.y=y;
        this.x =x;
    }

    public int[] getX() {

        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }



    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }
public Zd4()
{
    y=new int[2];
    x=new int[2];
    dan_Znam=new int[2];
    dan_Ches=new int[2];
    sum=new int[2];

}



    public void Wod_Dan()
    {
        Scanner scanner = new Scanner(System.in);
        int saiz=0;
        while (saiz!=2)
        {
            System.out.println("В ведите первую дробь в таком порядке чеслитель знаменатель \"x\" Enter \"y\"");
            this.x[saiz] = scanner.nextInt();
            System.out.println("Теперь знаминатель ");
            this.y[saiz] = scanner.nextInt();
            saiz++;

        }

    }
    public void Print(String computation,int arr[])
    {
        for (int i = 0; i <x.length;i++)
        {
            System.out.println(this.x[i]);
            System.out.println("--");
            System.out.println(this.y[i]);
        }
        System.out.println("Результат "+ computation);
        System.out.println(arr[0]);
        System.out.println("--");
        System.out.println(arr[1]);


    }
       public void Znamenatel(int znam[],int ches[])
{

   this.dan_Ches[0] = znam[0]* ches[1];
    this.dan_Znam[0] = ches[0]* ches[1];

    this.dan_Ches[1] = znam[1]* ches[0];
    this.dan_Znam[1] = ches[0]* ches[1];





}
public void Slojenie()
{
    this.sum[0]=this.dan_Ches[0]+this.dan_Ches[1];
    this.sum[1]=this.dan_Znam[0];


}
    public void Subtraction()
    {
        this.sum[0]=this.dan_Ches[0]-this.dan_Ches[1];
        this.sum[1]=this.dan_Znam[0];
    }

public void Umnojenie()
{
    this.sum[0]=this.x[0]*this.x[1];
    this.sum[1]=this.y[0]*this.y[1];


}
public void Delenie()
{
    this.sum[0]=x[0]*y[1];
    this.sum[1]=x[1]*y[0];

}
public int[] Sokratit(int arr[])
{
    int socra[]=new int[2];
    int iter=1;

    while(iter!=arr[0]+1)
    {
        if (arr[0]%iter==0 && arr[1]%iter==0)
        {
            socra[0]=arr[0]/iter;
            socra[1]=arr[1]/iter;

        }
        iter++;

    }



    return socra;

}

    @Override
    public String toString() {
        return "Zd4{" +
                "y=" + Arrays.toString(y) +
                ", x=" + Arrays.toString(x) +
                ", dan_Ches=" + Arrays.toString(dan_Ches) +
                ", dan_Znam=" + Arrays.toString(dan_Znam) +
                ", sum=" + Arrays.toString(sum) +
                '}';
    }


}
