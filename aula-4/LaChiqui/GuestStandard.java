public class GuestStandard extends Guest{

    GuestStandard(String name){
        super(name);
    }

    public void eatCake() {
        System.out.println(this.name + ": *boring noises*");
    }
}