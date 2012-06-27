package at.fhv.students.rotter.pizzacreator;

/**
 * Represents the pastry, the basic ingredient for a pizza,
 * which means that it is also a leave of the decorator pattern.
 */
public class Pastry implements Ingredient {
    /**
     * Returns the accumulative cost of the ingredient
     *
     * @return The accumulative cost of the ingredient
     */
    @Override
    public double getCost() {
        int cost = 3;
        return cost;
    }

    /**
     * Returns the name of the ingredients
     *
     * @return The name of the ingredients
     */
    @Override
    public String getName() {
        String name = "Pastry";
        return name;
    }
}
