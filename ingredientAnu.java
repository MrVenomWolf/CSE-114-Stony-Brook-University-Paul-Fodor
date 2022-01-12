
public class ingredientAnu {
    
    
    String name , measuringunit;
    
    int caloriesinperunit;
   
    
    public Ingredient(String name, String measuringunit, int caloriesinperunit){
        
        this.name = name;
        this.measuringunit = measuringunit;
        this.caloriesinperunit = caloriesinperunit;
    
    }
 
    
    
    public String toString() {

        return "Ingredient {name=" + name + ", measuringunit=" + measuringunit + ", caloriesinperunit=" + caloriesinperunit + "}";


    }
   
   
 
 }

