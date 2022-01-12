
public abstract class food {
    int calories;
    String description;

    food(int calories, String description) {
        this.calories = calories;
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }
    public String getDescription() { 
        return description;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int totalCalories(int serving);

    public String toString() {
        return
                "Name: " + description + "\n# of calories: " + calories;
    }

}
