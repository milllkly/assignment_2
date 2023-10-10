public class Milk extends CondimentDecorator {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double cost() {
        return 150 + coffee.cost();
    }
}
