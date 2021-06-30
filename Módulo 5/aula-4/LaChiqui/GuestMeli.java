public class GuestMeli extends Guest{

    GuestMeli(String name){
        super(name);
    }

    public void eatCake() {
        System.out.println(this.name + ": Viva la Chiqui !!");
    }

}