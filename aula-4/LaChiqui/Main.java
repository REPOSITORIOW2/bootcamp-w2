import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Guest> guests = new ArrayList<>();
        
        guests.add(new GuestMeli("Breno Waldo"));
        guests.add(new GuestMeli("Andrew Pachekson"));
        guests.add(new GuestStandard("Lucky Rabiero"));
        guests.add(new GuestMeli("Gabriell Sergius"));
        
        List<Firework> fireworks = new ArrayList<>();
        fireworks.add(new Firework());
        fireworks.add(new FireworkBundle(10));
        fireworks.add(new Firework());
        fireworks.add(new FireworkBundle(10));
        fireworks.add(new FireworkBundle(5, List.of(new Firework(), new FireworkBundle(5))));

        Event event = new Event(guests, fireworks);

        System.out.println("\nExploding fireworks...");
        event.explodeFireworks();
        System.out.println("\nWe exploded " + Firework.getExplodedFireworkCount() + " fireworks! (:");

        System.out.println("\nEating cakes...");
        event.eatCakes();
    }
} 