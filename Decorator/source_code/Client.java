package decoraterdesignpattern;

public class Client {

    public static void main(String[] args) {

        // Pizza thường (Concrete Component)
        Pizza pizza1 = new BasicPizza();
        System.out.println(pizza1.getDescription() + " = $" + pizza1.getCost());

        // Pizza thêm cheese (Concrete Decorator)
        Pizza pizza2 = new ExtraCheeseDecorator(new BasicPizza());
        System.out.println(pizza2.getDescription() + " = $" + pizza2.getCost());

        // Decorate nhiều lớp
        Pizza pizza3 = new ExtraCheeseDecorator(
                            new ExtraCheeseDecorator(new BasicPizza()));
        System.out.println(pizza3.getDescription() + " = $" + pizza3.getCost());
    }
}