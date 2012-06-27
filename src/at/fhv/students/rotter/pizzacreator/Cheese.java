package at.fhv.students.rotter.pizzacreator;

public class Cheese extends IngredientDecorator {
    /**
     * The constructor for the decorator pattern, which is used for
     * cascading the different ingredients
     *
     * @param decoratedIngredient
     */
    public Cheese(Ingredient decoratedIngredient) {
        super(decoratedIngredient);
    }

    @Override
    public double getCost() {
        double cost = 1;
        cost += super.getCost();
        return cost;
    }

    /**
     * Returns the name of the ingredients
     *
     * @return The name of the ingredients
     */
    @Override
    public String getName() {
        String name = super.getName();
        name = name + ", Cheese";
        return name;
    }
}
