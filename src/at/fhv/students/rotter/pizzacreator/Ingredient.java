package at.fhv.students.rotter.pizzacreator;

/**
 * Defines the ingredients interface for the decorator pattern
 */
public interface Ingredient {
    /**
     * Returns the accumulative cost of the ingredient
     *
     * @return The accumulative cost of the ingredient
     */
    public double getCost();

    /**
     * Returns the name of the ingredients
     *
     * @return The name of the ingredients
     */
    public String getName();
}
