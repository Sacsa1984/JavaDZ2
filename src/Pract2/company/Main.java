package Pract2.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Вібор задания 1-6 выход 0 ");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1: {
                    Zad1 zd1 = new Zad1("Александр", "Высоцкий", "Николаевич", "Кривой рог", "Ивана ивраменка д 18 кв 75", "09773215");
                  System.out.println(  zd1.toString());
                  break;
                }
                case 2:{
                    Zad2 zd2=new Zad2("Кривой Рог","Депропетровская","Украина",12.2,2979);
                    System.out.println(zd2.toString());
                    break;
                }
                case 3:{
                    String[] Goro = new String[]{"Кривой Рог", "Апостолово"};
                    Zd3 zd3 = new Zd3("Украина","Евразия",52,067,"Киев ",Goro);
                    System.out.println(zd3.toString());
                    break;
                }
                case 4: {
                    int []x=new int[]{7,12};
                    int []y=new int[]{2,5};
                    Zd4 zd4 = new Zd4(x,y);
                   System.out.println(zd4.toString());
                    String znac = "";

                    while (true) {
                        System.out.println("Для вычисления наберите \" + - * : \" завершение роботы \" $\"");
                        znac = scanner.next();
                        switch (znac) {
                            case "+": {
                                zd4.Znamenatel(zd4.getX(), zd4.getY());
                                zd4.Slojenie();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case "-": {
                                zd4.Znamenatel(zd4.getX(), zd4.getY());
                                zd4.Subtraction();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case "*": {
                                zd4.Umnojenie();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case ":": {
                                zd4.Delenie();
                                zd4.Sokratit(zd4.sum);
                                zd4.Print(znac, zd4.Sokratit(zd4.sum));
                                break;
                            }
                            case "$": {
                                System.exit(1);

                            }
                            default: {
                                System.out.println("не коректные данные");
                                break;


                            }
                        }
                    }
                }
                case 5:{
                    Zd5 zd5=new Zd5("Керри","Стівен Кінг",1974,"Клуб Сімейного Дозвілля","Трилер",224);

                    System.out.println(zd5.toString());
                    break;

                }
                case 6:{

                    Zd6 zd6=new Zd6("Tesla Model","TeslaMotors",2015,"75 кВт*ч");
                    System.out.println(zd6.toString());
                }
                case 0: {
                    System.exit(1);
                    break;
                }
                default: {
                    System.out.println("не коректные данные");
                }
            }
        }
    }
}
