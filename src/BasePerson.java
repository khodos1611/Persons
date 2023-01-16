import java.time.LocalDate;

import static java.lang.System.*;

abstract class BasePerson {
    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String mail;
    private String phone;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.age = LocalDate.now().getYear() - yearOfBirth;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }
}


class Person extends BasePerson{

    String surname;
    double weight;
    String pressure;
    int stepsCount;

    public Person(String name, String surname, String mail, String phone, int dayOfBirth, int monthOfBirth,
                  int yearOfBirth, double weight, int pressureTop, int pressureBottom,  int stepsCount) {
        setName(name);
        setDayOfBirth(dayOfBirth);
        setMonthOfBirth(monthOfBirth);
        setYearOfBirth(yearOfBirth);
        setMail(mail);
        setPhone(phone);

        this.surname = surname;
        this.weight = weight;
        this.pressure = pressureTop + "|"+ pressureBottom;
        this.stepsCount = stepsCount;
    }

    public void printAccountInfo(){
        out.println("name : " + getName());
        out.println("surname : " + surname);
        out.println("date of birth : " + getDayOfBirth() + "."+getMonthOfBirth()+"."+getYearOfBirth());
        out.println("age : " + getAge());
        out.println("mail : " + getMail());
        out.println("phone : " + getPhone());
        out.println("weight : " + weight);
        out.println("pressure : " + pressure);
        out.println("steps count : " + stepsCount);
        out.println("-------");
    }

}

