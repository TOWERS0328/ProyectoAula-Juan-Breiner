
package model;

/**
 *
 * @author juand
 */
public class Residue {
     private int id;
    private String code;
    private String type;
    private int points;

    public Residue(int id, String code, String type, int points) {
        this.id = id;
        this.code = code;
        this.type = type;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Residue{" + "id=" + id + ", code=" + code + ", type=" + type + ", points=" + points + '}';
    }
    
}
