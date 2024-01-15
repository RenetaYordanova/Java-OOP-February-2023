package P04WildFarm.animal;

import P04WildFarm.food.Food;
import P04WildFarm.food.Meat;


public class Tiger extends Feline{
    public Tiger(String name, double weight, String region) {
        super(name, weight, region, AnimalType.Tiger);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public boolean willEatFood(Food food) {
        return false;
    }

    @Override
    public void eat(Food food) {
        if (!willEatFood(food)) {
            System.out.printf("%s are not eating that type of food!\n", getTypeName());
            return;
        }

        super.eat(food);

        System.out.println("Tiger");
    }

    private String getTypeName() {

        return super.getType().name() + "s";
    }
}

