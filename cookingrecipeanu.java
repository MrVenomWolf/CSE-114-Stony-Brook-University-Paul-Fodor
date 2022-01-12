import java.util.*;
public class cookingrecipeanu {
   
   String name;
  
   
public ArrayList<ingredientAnu> ingredients = new ArrayList<ingredientAnu>();


   List<Object> listo = new ArrayList<Object>();


  
   
   public cookingrecipeanu(String name){
       this.name = name;
   }
  
   
   public void add(ingredientAnu ingredient, float quantity){
      
      
       

       listo.add(ingredient);
       listo.add(quantity);
      
   }

   
   public RecipeingredientAnu removerecipeingredient(ingredientAnu ingredient){
      
       listo.remove(ingredient);
       return null;  
   }

   
   public RecipeingredientAnu removerecipeingredient(String ingredientname){
       listo.remove(ingredientname);

       return null;
   }

   
   public int getnumberofingredients(){
       System.out.println(" From Recipe the number Of ingredients = " +listo.size());
       return 0;
      
   }
   
   public float calculatecalories() {
       ingredientAnu ingredient = new ingredientAnu("Chicken Panini", "0.7kg", 19);
      
       float sum = ingredient.caloriesinperunit;
       System.out.println("From Recipe the sum of calaories = " +sum);

      
       return sum;
   }
  
   @Override
   public String toString() {
       return "CookingrecipeAnu [name=" + name + "]";
   }
}