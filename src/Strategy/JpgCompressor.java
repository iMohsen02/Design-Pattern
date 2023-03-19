package Strategy;

public class JpgCompressor implements Compressor{
    @Override
    public void Compress(String filename) {
        System.out.println(filename + " compressed using JPG.");
    }
}
