package model;

import java.io.Serializable;

/**
 *
 * @author juand
 */
public class User implements Serializable { // ✅ Implementa Serializable
    private static final long serialVersionUID = 1L; // ✅ Recomendado para serialización

    private int id;
    private String name;
    private String lastName;
    private String password;
    private String email;
    private String career;
    private String idUser;
    private int points;

    public User() {
        // Constructor vacío necesario para serialización
    }

    public User(int id, String name, String lastName, String password, String email, String career, String idUser, int points) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.career = career;
        this.idUser = idUser;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

   
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", career='" + career + '\'' +
                ", idUser='" + idUser + '\'' +
                ", points=" + points +
                '}';
    }
}
