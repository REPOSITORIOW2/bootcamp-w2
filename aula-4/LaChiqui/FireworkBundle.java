import java.util.ArrayList;
import java.util.List;

class FireworkBundle extends Firework {
    List<Firework> bundle;

    public FireworkBundle() {
        this.bundle = new ArrayList<Firework>();
    }

    public FireworkBundle(Integer bundleSize) {
        this.bundle = new ArrayList<Firework>();
        for (int i = 0; i < bundleSize; i++) {
            this.addFirework(new Firework());
        }
    }

    public FireworkBundle(Integer bundleSize, List<Firework> fireworks) {
        this.bundle = new ArrayList<Firework>();
        for (int i = 0; i < bundleSize; i++) {
            this.addFirework(new Firework());
        }
        this.bundle.addAll(fireworks);
    }

    public void addFirework(Firework fw) {
        this.bundle.add(fw);
    }

    public void explode() {
        bundle.forEach(f -> f.explode());
    }
}