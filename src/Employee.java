public class Employee {
    private String nameSurname;
    private String position;
    private String email;
    private int age;

    public Employee(String nameSurname, String position, String email, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
