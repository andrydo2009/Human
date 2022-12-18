import java.util.Objects;

public class Human {

    private int yearOfBirth;       // год рождения
    String name;          // имя
    private String town;          // город
    String jobTitle;     // профессия

    Human()
    {
        this.yearOfBirth=0;
        this.name="No info";
        this.town="No info";
        this.jobTitle="No info";
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town==null^Objects.equals(town,"")){town="Информации нет";}
        this.town = town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        yearOfBirth = Math.max(yearOfBirth, 0);
        this.yearOfBirth = yearOfBirth;
    }
    Human (int yearOfBirth, String name, String town, String jobTitle) {
        Human.this.setYearOfBirth(yearOfBirth);
        if (name==null^ Objects.equals(name, "")){this.name="Информации нет";}
        else {this.name=name;}
        Human.this.setTown(town);
        if (jobTitle==null^Objects.equals(jobTitle,"")){this.jobTitle="Информации нет";}
        else {this.jobTitle=jobTitle;}
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " +
                getTown() + ". Я родился в " + getYearOfBirth() + " году"
                + ". Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }

}

//

