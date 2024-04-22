public class Rabbit extends Animal {

    @Override
    public String voice() {
        return "I am a Rabbit: cluck, chug, scream";
    }

    @Override
    public String eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            return "Rabbit: I don't like Meat";
        } else if (food.equalsIgnoreCase("Grass")) {
            return "Rabbit: I like Grass. Yummy";
        } else {
            return "Rabbit: I don't like this " + food;
        }
    }

}
