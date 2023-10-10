public class Cinnamon extends CondimentDecorator {
    Coffee coffee;

    public Cinnamon(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Cinnamon";
    }

    public double cost() {
        return 140 + coffee.cost();
    }
}
