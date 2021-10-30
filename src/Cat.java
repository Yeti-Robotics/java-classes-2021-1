public class Cat extends Mammal {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Meow uwu " + name;
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
