package model;

public class User {

    private String idUser;
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String career;
    private int points;

    public User() {
    }

    public User(String idUser, String name, String lastName, String password, String email, String career, int points) {
        this.idUser = idUser;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.career = career;
        this.points = points;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", name=" + name + ", lastName=" + lastName + ", password=" + password + ", email=" + email + ", career=" + career + ", points=" + points + '}';
    }

    
}
