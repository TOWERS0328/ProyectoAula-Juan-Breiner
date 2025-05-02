
package util;

/**
 *
 * @author Breiner
 */
public class LoginRequest {
    private String idUser;
    private String password;

    public LoginRequest(String idUser, String password) {
        this.idUser = idUser;
        this.password = password;
    }

    public String getIdUser() {
        return idUser;
    }

    public String getPassword() {
        return password;
    }
}

