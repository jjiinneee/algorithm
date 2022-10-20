package com.algorithm.companyCodingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IceCreamMachine {
  public String[] ingredients;
  public String[] toppings;
  
  public static class IceCream {
    public String ingredient;
    public String topping;
    
    public IceCream(String ingredient, String topping) {
      this.ingredient = ingredient;
      this.topping = topping;
    }
  }
  
  public IceCreamMachine(String[] ingredeints, String[] toppings) {
    this.ingredients = ingredeints;
    this.toppings = toppings;
  }
  
  //List<IceCream>
  public List<IceCream>  scoops() {
    
    List<IceCream> ice = new ArrayList<>();
    
    for (int i = 0; i < ingredients.length; i++) {
      for (int j = 0; j < toppings.length; j++) {
        IceCream vo = new IceCream(ingredients[i], toppings[j]);
        ice.add(vo);
      }

    }
    return ice;
  }
  
  public static void main(String[] args) {
    IceCreamMachine machine = new IceCreamMachine(new String[]{
            "vanilla", "chocolate"
    }, new String[]{
            "chocolate sauce"
    });
    List<IceCream> scoops = machine.scoops();
    
    /*
     * Should print:
     * vanilla, chocolate sauce
     * chocolate, chocolate sauce
     */
    for (IceCream iceCream : scoops) {
      System.out.println(iceCream.ingredient + ", " + iceCream.topping);
    }
  }
}
