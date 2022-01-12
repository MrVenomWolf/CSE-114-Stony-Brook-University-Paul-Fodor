
public class RecipeingredientAnu extends ingredientAnu {

    
    float quantity;
   
    
    public RecipeingredientAnu(String name, String measuringunit, int caloriesinperunit,float quantity) {
        
        
        super(name, measuringUnit, caloriesinperunit);
       
    
        this.quantity = quantity;
 
    }
 }