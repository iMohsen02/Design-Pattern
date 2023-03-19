package Strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String filename) {
        System.out.println(filename + "B&W filter applied.");
    }
}
