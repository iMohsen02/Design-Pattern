package Strategy;

public class PngCompressor implements Compressor {
    @Override
    public void Compress(String filename) {
        System.out.println(filename + " compressed using PNG.");
    }
}
