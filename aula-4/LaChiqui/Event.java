import java.util.ArrayList;
import java.util.List;

public class Event {

    List<Guest> guests;
    List<Firework> fireworks;

    public Event() { 
        guests = new ArrayList<Guest>();
        fireworks = new ArrayList<Firework>();
    }

    public Event(List<Guest> guests, List<Firework> fireworks) {
        this.guests = guests;
        this.fireworks = fireworks;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void addGuests(List<Guest> guests) {
        guests.addAll(guests);
    }

    public void addFirework(Firework firework) {
        fireworks.add(firework);
    }

    public void addFireworks(List<Firework> fireworkList) {
        fireworks.addAll(fireworkList);
    }

    public void explodeFireworks() {
        fireworks.stream().forEach(Firework::explode);
    }

    public void eatCakes() {
        guests.stream().forEach(Guest::eatCake);
    }

    public List<Guest> getGuests() {
        return this.guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public List<Firework> getFireworks() {
        return this.fireworks;
    }

    public void setFireworks(List<Firework> fireworks) {
        this.fireworks = fireworks;
    }

    @Override
    public String toString() {
        return "{" +
            " guests='" + getGuests() + "'" +
            ", fireworks='" + getFireworks() + "'" +
            "}";
    }
}
