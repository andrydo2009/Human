import java.util.Objects;

public class Human {

    int yearOfBirth;       // год рождения
    String name;          // имя
    String town;          // город
    String jobTitle;     // профессия

    Human()
    {}



    Human (int yearOfBirth,String name,String town,String jobTitle) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        if (name==null^ Objects.equals(name, "")){this.name="Информации нет";}
        else {this.name=name;}
        if (town==null^Objects.equals(town,"")){this.town="Информации нет";}
        else {this.town=town;}
        if (jobTitle==null^Objects.equals(jobTitle,"")){this.jobTitle="Информации нет";}
        else {this.jobTitle=jobTitle;}
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " +
                town + ". Я родился в " + yearOfBirth + " году"
                + ". Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}


// The END