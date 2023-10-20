package PeopleByAge;

//Aquí se crea la clase Persona con sus respectivos atributos
public class Person implements Comparable<Person> {
    private String name;

    //Aquí se visualiza el compareTo
    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age, p.age);
    }

    private Integer age;
    private String gender;

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
