package behavioral.strategy.compress;

/**
 * Created by jarydu on 3/14/17.
 */
public class TarCompression implements CompressionStrategy {
    @Override
    public void compress(Input input) {
        System.out.println("Tar compressing...");
    }
}
