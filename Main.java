import java.util.ArrayList;

class Ingredient {
       private String name;

       public Ingredient(String name) {
           this.name = name;
      }
   
       public String getName() {
           return name;
      }
   }
   
   class Pastry {
       private String name;
       private ArrayList<Ingredient> ingredients;
   
       public Pastry(String name) {
           this.name = name;
          ingredients = new ArrayList<>();
       }
   
       public void addIngredient(Ingredient ingredient) {
           ingredients.add(ingredient);
       }
   
       public void displayIngredients() {
           System.out.println("Ingredients for " + name + ":");
           for (Ingredient ingredient : ingredients) {
               System.out.println(ingredient.getName());
           }
       }
   
       public String getName() {
           return name;
       }
   }
   
   class Bakery {
       private ArrayList<Pastry> pastries;
   
       public Bakery() {
           pastries = new ArrayList<>();
       }
   
      public void addPastry(Pastry pastry) {
           pastries.add(pastry);
       }
   
      public void displayPastries() {
          System.out.println("Pastries in the bakery:");
          for (Pastry pastry : pastries) {
               System.out.println("Pastry: " + pastry.getName());
               pastry.displayIngredients();
               System.out.println();
         }
      }
   }
   
   public class Main {
       public static void main(String[] args) {
           Ingredient flour = new Ingredient("Flour");
          Ingredient sugar = new Ingredient("Sugar");
  
         Pastry croissant = new Pastry("Croissant");
        croissant.addIngredient(flour);
        croissant.addIngredient(sugar);
   
           Pastry muffin = new Pastry("Blueberry Muffin");
           muffin.addIngredient(flour);
          muffin.addIngredient(sugar);
   
           Bakery bakery = new Bakery();
           bakery.addPastry(croissant);
           bakery.addPastry(muffin);
           
           //Creation of 'cake' object and addition to the pastry array
           Cake cake = new Cake("Birthday Cake");
           bakery.addPastry(cake);
   
           bakery.displayPastries();
       }
   }
