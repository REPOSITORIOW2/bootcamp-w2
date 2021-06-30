import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class NoiseGenerator {

    private static NoiseGenerator noiseGenerator;
    private static List<String> fireworkNoises;
    private static Random random;
    
    private NoiseGenerator() {
        fireworkNoises = Arrays.asList("miss :(", "BOOM", "KABOOM", "KATABOOM", "CHAKABLAM", "KATAPOW", "KABLAM", "KACHAU", "BANG", "POP", "WHOOSH", "CRACKLE", "CRACK", "SNAP", "FIZZ", "HISS", "CHABLAU", "PIMPOM", "PUFF", "POPO", "STAPH");
    }

    public static NoiseGenerator getInstance() {
        if(noiseGenerator == null){
            random = new Random();
            noiseGenerator = new NoiseGenerator();
        }
        return noiseGenerator;
    }

    public String randomNoise() {
        int randomIndex = random.nextInt(fireworkNoises.size() - 1);
        return fireworkNoises.get(randomIndex);
    }
}