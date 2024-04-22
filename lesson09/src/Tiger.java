public class Tiger extends Animal {

    @Override
    public String voice() {
        return "I am a Tiger: roar";
    }

    @Override
    public String eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            return "Tiger: I love Meat. Yummy";
        } else if (food.equalsIgnoreCase("Grass")) {
            return "Tiger: I don't like Grass";
        } else {
           return "Tiger: I don't like this " + food;
        }
    }

}
