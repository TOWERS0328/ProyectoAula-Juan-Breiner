package model;

public class Award {
    private String code;
    private String name;
    private String category;
    private int points;

    public Award() {
    }

    public Award(String code, String name, String category, int points) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.points = points;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Award{" + "code=" + code + ", name=" + name + ", category=" + category + ", points=" + points + '}';
    }

    
}
