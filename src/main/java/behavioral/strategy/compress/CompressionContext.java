package behavioral.strategy.compress;

import structural.composite.graph.Component;

/**
 * Created by jarydu on 3/14/17.
 */
public class CompressionContext {
    private final CompressionStrategy compressStrategy;

    public CompressionContext(CompressionStrategy strategy) {
        this.compressStrategy = strategy;
    }

    public void compress(Input input) {
        compressStrategy.compress(input);
    }

    public static void main(String[] args) {
        CompressionStrategy hd = new HDCompression();
        CompressionStrategy zip = new ZipCompression();
        CompressionStrategy tar = new TarCompression();

        CompressionContext c1 = new CompressionContext(hd);
        CompressionContext c2 = new CompressionContext(zip);
        CompressionContext c3 = new CompressionContext(tar);

        c1.compress(new Input());
        c2.compress(new Input());
        c3.compress(new Input());
    }
}
