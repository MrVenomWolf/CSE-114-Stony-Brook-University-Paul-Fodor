

import java.util.*;

public class testrecipebookanu {
  
   public static void main(String[] args){
      
       ArrayList<recipebookanu> recipe = new ArrayList<recipebookanu>();
      
       
       recipebookanu bookobject = new recipebookanu("Recipe Book 1");
      
       recipebookanu bookobject1 = new recipebookanu("Recipe Book 2");

       
       recipe.add(bookobject);
      
      
       recipe.add(bookobject1);
      
       ingredientAnu[] ingrediObject = new ingredientAnu[4];

       RecipeingredientAnu[] recipeObject = new RecipeingredientAnu[4];
      
       ingredientAnu ingrediObject1 = new ingredientAnu("Bread","4kg", 1200);
      
       ingredientAnu ingredObject2 = new ingredientAnu("Chicken","9kg",6481);
      
       System.out.println("Recipe Book 1 "+bookobject);
       System.out.println("Recipe Book 2 "+bookobject1);
       
       System.out.println();

       System.out.println("ingredients Name = " +ingrediObject1.name);
       System.out.println("ingredients(Measuringunit) = " +ingrediObject1.measuringunit);
       System.out.println("ingredients(caloriesperunit) = " +ingrediObject1.caloriesinperunit);
      
       System.out.println();
       
       System.out.println("ingredients Name = " +ingredObject2.name);
       System.out.println("ingredients(Measuringunit) = " +ingredObject2.measuringunit);
       System.out.println("ingredients(caloriesperunit) = " +ingredObject2.caloriesinperunit);
      
       cookingrecipeanu cooko = new cookingrecipeanu("hashbrowns");

       cooko.add(ingredObject2, 300.4f);
      
       System.out.println();
       System.out.println("Add ingredients and quantity ");
       
       System.out.println();
      
       System.out.println("Add number of ingredients "+cooko.getnumberofingredients());
       
       System.out.println();
      
       cooko.removerecipeingredient(ingredObject2);
       
       System.out.println(" remove ingredentobject and quanitty ");
       
       System.out.println();

       cooko.removerecipeingredient("Chicken");
       
       System.out.println("remove Recipe ingredient name ");
       
       System.out.println();
      
       cooko.getnumberofingredients();
      
       System.out.println();
       
       cooko.calculatecalories();
      
   }

}