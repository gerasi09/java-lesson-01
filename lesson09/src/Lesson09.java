public class Lesson09 {

    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println("--- Dog ---");
        System.out.println(dog.voice());
        System.out.println(dog.eat("Grass"));
        System.out.println(dog.eat("Meat"));
        System.out.println(dog.eat("Mushroom"));

        Animal tiger = new Tiger();
        System.out.println("--- Tiger ---");
        System.out.println(tiger.voice());
        System.out.println(tiger.eat("Grass"));
        System.out.println(tiger.eat("Meat"));
        System.out.println(tiger.eat("Avocado"));

        Animal rabbit = new Rabbit();
        System.out.println("--- Rabbit ---");
        System.out.println(rabbit.voice());
        System.out.println(rabbit.eat("Grass"));
        System.out.println(rabbit.eat("Meat"));
        System.out.println(rabbit.eat("Chocolate"));

    }

}
