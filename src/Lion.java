public class Lion extends Cat {
    public Lion(String lionName){
        super(lionName);
    }

    @Override
    public String speak() {
        return "roar uwu my name is " + name;
    }
}
