
public abstract class geometricobject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected geometricobject() {
        dateCreated = new java.util.Date();
    }

    protected geometricobject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "color: " + color + " and filled: " + filled + ", created on " + dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
