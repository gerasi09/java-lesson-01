public class Dog extends Animal {

    @Override
    public String voice() {
        return "I am a Dog: woof, woof";
    }

    @Override
    public String eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            return "Dog: I love Meat. Yummy";
        } else if (food.equalsIgnoreCase("Grass")) {
            return "Dog: I don't like Grass";
        } else {
            return "Dog: I don't like this " + food;
        }
    }

}
