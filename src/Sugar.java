public class Sugar extends CondimentDecorator {
    Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public double cost() {
        return 100 + coffee.cost();
    }
}
