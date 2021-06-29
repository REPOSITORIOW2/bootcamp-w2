public class Noise {

    private String noise;

    Noise() {
        NoiseGenerator generator = NoiseGenerator.getInstance();
        this.noise = generator.randomNoise();
    }

    public String getNoise(){
        return this.noise;
    }
}