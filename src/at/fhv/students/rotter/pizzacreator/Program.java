package at.fhv.students.rotter.pizzacreator;

public class Program {
    public static void main(String[] args) {
        Ingredient margarita = new Cheese(new TomatoSauce(new Pastry()));
        System.out.println(margarita.getName());
        System.out.println(margarita.getCost());
    }
}
