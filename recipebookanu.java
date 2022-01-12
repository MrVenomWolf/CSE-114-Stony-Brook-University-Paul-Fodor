public class recipebookanu {
    
    String bookname;
   
    
    public recipebook(String bookName){
            this.bookName = bookName;
    }
 
    
    public cookingrecipeanu addRecipe(String name, RecipeingredientAnu[] ingredients) {
        
        this.bookName = name;
       
        
        RecipeingredientAnu ingredients2 = new RecipeingredientAnu(name,"3kg",600,2.25f);
       
        
        cookingrecipeanu object1 = new cookingrecipeanu(name);
       
        object1.add(ingredients2, 43.5f);
       
        return object1;
    }
   
    public cookingrecipeanu removeRecipe(String name){
        

        cookingrecipe object1 = new cookingrecipeanu(name);
       
        
        object1.removerecipeingredient(name);
       
        
        return object1;
    }
    
    public cookingrecipeanu[] findRecipes(RecipeingredientAnu[] ingredients){
        return null;
       
       
    }
    
    public cookingrecipeanu[] findrecipeswithfewingredients(int numberofingredients){
        return null;
       
    }
   
    
    public cookingrecipeanu[] findrecipeslowcalories(){
        return null;
       
    }
 
    @Override
    public String toString() {
        return "RecipeBook [bookName=" + bookName + "]";
    }
 
 }