public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (firstName == null)
            firstName = "";
        if (lastName == null)
            lastName = "";
        if (firstName == "")
            return lastName;
        else
            return firstName + " " + lastName;
    }
}
