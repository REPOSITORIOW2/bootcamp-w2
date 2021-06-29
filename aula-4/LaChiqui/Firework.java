public class Firework {

    private Noise noise;
    private static int explodedFireworksCount = 0;

    public Firework() {
        this.noise = new Noise();
    }

    public static int getExplodedFireworkCount(){
        return explodedFireworksCount;
    }
    
    public void explode(){
        System.out.println(this.noise.getNoise());
        explodedFireworksCount++;
    }
}