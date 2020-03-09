public class HuffmanLeaf extends HuffmanTree {
    public final char value;
    public char frequency;

    public HuffmanLeaf(int freq, char val) {
        super(freq);
        value = val;
    }
}
