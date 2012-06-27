package at.fhv.students.rotter.pizzacreator;

public class TomatoSauce extends IngredientDecorator {
    /**
     * The constructor for the decorator pattern, which is used for
     * cascading the different ingredients
     *
     * @param decoratedIngredient
     */
    public TomatoSauce(Ingredient decoratedIngredient) {
        super(decoratedIngredient);
    }

    /**
     * Returns the accumulative cost of the ingredients
     *
     * @return The accumulative cost of the ingredients
     */
    @Override
    public double getCost() {
        double cost = 1.5;
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
        name = name + ", TomatoSauce";
        return name;
    }
}
