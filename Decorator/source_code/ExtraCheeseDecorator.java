package decoraterdesignpattern;

public class ExtraCheeseDecorator extends PizzaDecorator {

    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}