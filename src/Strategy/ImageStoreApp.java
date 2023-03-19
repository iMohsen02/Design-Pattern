package Strategy;

public class ImageStoreApp {
    public static void main(String[] args) {

//        var store = new ImageStore(ImageStore.CompressorEnum.JPG, ImageStore.FilterEnum.BLACK_AND_WHITE);
//        store.saveImage("C:\\users\\user\\Desktop\\picture");

        var store = new ImageStore();
        store.saveImage(new PngCompressor(), new BlackAndWhiteFilter(), "C:\\users\\user\\Desktop\\picture");
        store.saveImage(new JpgCompressor(), new BlackAndWhiteFilter(), "C:\\users\\user\\Desktop\\picture");

    }
}
