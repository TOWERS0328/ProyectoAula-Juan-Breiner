
package model;

public class Residue {
    private String code;
    private String type;
    private String object;
    private int points;

    public Residue() {
    }
    
    public Residue(String code, String type, String object, int points) {
        this.code = code;
        this.type = type;
        this.object = object;
        this.points = points;
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

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Residue{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", object='" + object + '\'' +
                ", points=" + points +
                '}';
    }
}
