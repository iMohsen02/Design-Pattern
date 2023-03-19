package Strategy;

public class ImageStore {

    public void saveImage(Compressor compressor, Filter filter, String filename) {
        compressor.Compress(filename);
        filter.apply(filename);

        System.out.println("IMAGE SAVED");
    }

//    CompressorEnum compressor;
//    FilterEnum filter;
//
//    public ImageStore(CompressorEnum compressor, FilterEnum filter) {
//
//        this.compressor = compressor;
//        this.filter = filter;
//
//    }
//
//    public void saveImage(String filename) {
//        if (compressor == CompressorEnum.JPG)
//            System.out.println(filename + " compressed using jpg.");
//        else if (compressor == CompressorEnum.PNG)
//            System.out.println(filename + " compressed using pnj.");
//        else {
//            System.out.println("compressor not chosen.");
//        }
//
//        if (filter == FilterEnum.BLACK_AND_WHITE)
//            System.out.println(filename + " apply filer B&W.");
//
//        System.out.println("IMAGE SAVED.");
//    }
//
//    public enum CompressorEnum {
//        PNG,
//        JPG
//    }
//
//    public enum FilterEnum {
//        BLACK_AND_WHITE,
//    }
}
