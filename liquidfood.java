
public class liquidfood extends food {
    int viscocity;

    liquidfood(String description, int calories, int viscocity) {
        super(description, calories);
        this.viscocity = viscocity;
    }

    public int getViscocity() {
        return viscocity;
    }

    public void setSeason(int viscocity) {
        this.viscocity = viscocity;
    }

    public int  totalCalories(int serving) {
        return calories*serving ;
    }

}
