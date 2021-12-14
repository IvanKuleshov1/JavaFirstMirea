public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Human adam = new Human("Adam");
        Leg adamLeg = new Leg(2);
        Hand adamHand = new Hand(2);
        Head adamHead = new Head(true);
        if(adamLeg.getLeg()==2 && adamHand.getHand()==2 && adamHead.isHeadOk())
            System.out.println(adam.getName() + " is okay.");
        else
            System.out.println("Hey, " + adam.getName() + "! There is something wrong with you...");
    }
}
