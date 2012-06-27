package at.fhv.students.rotter.pizzacreator;

public class IngredientDecorator implements Ingredient {

    /**
     * The decorated ingredient
     */
    private Ingredient _decoratedIngredient;

    /**
     * The constructor for the decorator pattern, which is used for
     * cascading the different ingredients
     *
     * @param decoratedIngredient
     */
    public IngredientDecorator(Ingredient decoratedIngredient) {
        _decoratedIngredient = decoratedIngredient;
    }

    /**
     * Returns the accumulative cost of the ingredient
     *
     * @return The accumulative cost of the ingredient
     */
    @Override
    public double getCost() {
        double cost = _decoratedIngredient.getCost();
        return cost;
    }

    /**
     * Returns the name of the ingredients
     *
     * @return The name of the ingredients
     */
    @Override
    public String getName() {
        String name = _decoratedIngredient.getName();
        return name;
    }
}
