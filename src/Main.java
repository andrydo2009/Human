public class Main {
    public static void main(String[] args) {

        Human Person_1 = new Human(1990, "Аня", "Москва", "Фармацевт");
        Human Person_2 = new Human(1978, "Максим", "Омск", "Крановщик");
        Human Person_3 = new Human(2002, "Катя", "Казань", "Студентка");
        Human Person_4 = new Human(2011, "Артем", "Хабаровск", "Школьник");
        Human Person_5 = new Human(-80,"",null,"");
        Human Person_6 = new Human();
        Human Person_7 = new Human(2001,"Владимир","Казань","");
        System.out.println(Person_1);
        System.out.println(Person_2);
        System.out.println(Person_3);
        System.out.println(Person_4);
        System.out.println(Person_5);
        System.out.println(Person_6);

        Person_1.setYearOfBirth(-90);
        Person_1.setTown("New York");
        System.out.println(Person_1.getYearOfBirth());
        System.out.println(Person_1.getTown());
        System.out.println(Person_1);
        System.out.println(Person_7);

        System.out.println(" ");
    }
}

//