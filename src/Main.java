public class Main {
    public static void main(String[] args) {
        System.out.println("Задание первое ");
        byte byt = 1;
        short shr = 3213;
int in = 12312512;
        long lg = 12578125912L;
float fl = 123.3f;
double db = 12312.23324;
        System.out.println("Значение перемнной флоат "+fl);
        System.out.println("Значение переменной тип дабл "+db);
        System.out.println("Значение переменной байт " +byt);
        System.out.println("Значение переменной шорт "+shr);
        System.out.println("Значение переменной инт "+in);
        System.out.println("Значение переменой лонг "+ lg);
        System.out.println("Задание 2");
        float n1 = 27.12f;
        short n2 = 987;
        short n3 = 678;
        short n4 = 965;
        short n5 = 549;
        double n6 =2.786;
        boolean n7 = n3>n2;
        int n8 = 569;
        int n9 = -159;
        long n10 = 27897l;
        byte n11 = 67;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(n8);
        System.out.println(n9);
        System.out.println(n10);
        System.out.println(n11);
        System.out.println("задание 3");
        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        short totalpapers = 480 ;
        byte totalstudent = (byte) (Ludmila + Anna + Ekaterina);
        int onestudentpapers = totalpapers/totalstudent;
        System.out.println("На каждого ученика рассчитано " + onestudentpapers + " листов бумаги ");
        System.out.println("Задание 4");
        short bottel =16;
        short time1 = 2;
        short time2 = 20;
        short time3 = 24*60;
        short tim4= 3*24*60;
        int time5 = 30 * 24*60;
        short bottelpermin = 16/2;
        int bottel2 = time2*bottelpermin;
        int boottel3 = time3*bottelpermin;
        int bottel4 = tim4*bottelpermin;
        int bottel5 = time5*bottelpermin;
        System.out.println("За "+time1 + " минуты  машина произвела бутылок "+ bottel+ " штук");
        System.out.println("За "+time2 + " минуты машина произвела бутылок "+ bottel2+ " штук");
        System.out.println("За "+time3 + " минуты машина произвела бутылок "+ boottel3+ " штук");
        System.out.println("За "+tim4 + " минуты машина произвела бутылок "+ bottel4+ " штук");
        System.out.println("За "+time5 + " минуты машина произвела бутылок "+ bottel5+ " штук");
        System.out.println("Задание 5");
        short totalcolor = 120;
        byte brown = 4;
        byte white = 2;
        int classroom=brown+white;
        int allclassroom= totalcolor/classroom;
        int allbrowncolor = allclassroom*brown;
        int allwhitecolor = allclassroom*white;
        System.out.println("В школе, где " + allclassroom+ " классов, нужно "+ allwhitecolor+ " банок белой краски и "+ allbrowncolor+ " банок коричневой краски ");
        System.out.println("задание 6");
        byte bannanas = 5;
        short onebannanaswghite = 80 ;
        short milk100ml = 2;
        short milkwghite100ml = 105;
        byte icecreem = 2;
        short icecreemwghite = 100;
        byte eg = 4 ;
        byte egwghite = 70;
        int totalwgite = (bannanas*onebannanaswghite)+(milk100ml*milkwghite100ml)+(icecreem*icecreemwghite)+(eg*egwghite);
        float totalwghitekg = totalwgite/1000f;
        System.out.println("Завтрак спортсмена равен " + totalwgite + " в граммах и завтра спотсмена равен "+ totalwghitekg + " в кг");
        System.out.println("Задание 7");
        short totallousewgite = 7000;
        short perdaylousewghite1 = 250;
        short perdaylousewghite2 = 500;
        int daytolouse1 = totallousewgite/perdaylousewghite1;
        int daytolouse2 = totallousewgite/ perdaylousewghite2;
        float daytolousemean = (daytolouse1+daytolouse2)/2f;
            System.out.println( daytolouse1 + " дней уйдет если спортсмен будет сбрасывать 250 грамм в день, " +daytolouse2 + " дней уйдет если спорсмен будет сбрасывать 500 грамм в день, а срднее кол-во дней " + daytolousemean);
            System.out.println("задание 8");
            int Masha = 67760;
            int Denis = 83690;
            int Kristina = 76230;
            float stonks = 1.1f;
            float Mashastonks = Masha*stonks;
            float Denisstonks = Denis*stonks;
            float Kristinastonks =Kristina*stonks;
            float Mashaperyear2=Mashastonks*12;
            float Denisperyear2=Denisstonks*12;
            float Kristinaperyear2=Kristinastonks*12;
            int Mashaperyear1=Masha*12;
            int Denisperyaer1=Denis*12;
            int Kristinaperyear1=Kristina*12;
            float Mashadiff=Mashaperyear2-Mashaperyear1;
            float Denisdiff=Denisperyear2-Denisperyaer1;
            float Kristinadiff=Kristinaperyear2-Kristinaperyear1;
            System.out.println("Маша получает "+ Mashastonks+ " , годовой доход вырос на  "+Mashadiff);
            System.out.println("Денис получает "+ Denisstonks+" годовой доход вырос на "+Denisdiff);
            System.out.println("Крстина получает "+ Kristinastonks+" годовой доход вырос на "+Kristinadiff);

















    }
}