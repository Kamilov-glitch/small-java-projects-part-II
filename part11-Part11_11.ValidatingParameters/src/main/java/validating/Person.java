package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.length() > 40 || name.isEmpty()) {
            throw new IllegalArgumentException("name can't be null or longer than 40 characters or empty");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("age can't be negative or bigger than 120");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
