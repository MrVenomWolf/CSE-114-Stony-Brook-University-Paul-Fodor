
public class fruit extends food {

    String season;

    fruit(String description, int calories, String season) {
        super(description, calories);
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int totalCalories(int serving) {
        return serving * calories;
    }

}
