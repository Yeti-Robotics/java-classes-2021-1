public class Classes {
    public static void main(String[] args) {
        System.out.println("Today we will learn about classes! :)");

        Mammal someMammal = new Mammal();
        System.out.println(someMammal + " says " + someMammal.speak());

        Cat jacob = new Cat("Jacob");
        System.out.println(jacob + " says " + jacob.speak());

        Lion simba = new Lion("Simba");
        System.out.println(simba.speak());
    }
}
