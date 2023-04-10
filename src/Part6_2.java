public class Part6_2
{
    private int COMING_OF_AGE  = 18;
    private String name;
    private String surname;
    private int birthYear;
    public Part6_2(String name, String surname, int birthYear)
    {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
    public void printPersonInfo()
    {
        System.out.println("Name = "+ name);
        System.out.println("Surname = " + surname);
        System.out.println("Birth Year = " + birthYear);

    }
    public boolean isAdult()
    {
        int age = java.time.LocalDate.now().getYear() - birthYear;
        if(age >= COMING_OF_AGE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {


        Part6_2 person = new Part6_2("Jane", "Doe", 1985);
        person.printPersonInfo();
        System.out.println("Is "+person.name +" an adult? " + person.isAdult());
    }
}
