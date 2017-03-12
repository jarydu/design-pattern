package behavioral.iterator.dag;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by jarydu on 3/12/17.
 */
public class Node implements Iterable<Node> {
    private final int val;
    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Node> action) {
        throw new UnsupportedOperationException("forEach is not supported yet");
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }

    public static class Builder {
        private Node h;
        private Node e;

        public Builder() {
            this.h = null;
            this.e = this.h;
        }

        public Builder append(int val) {
            Node n = new Node(val);
            if (h == null) {
                h = n;
                e = n;
            } else {
                e.next = n;
                e = e.next;
            }

            return this;
        }

        public Node build() {
            return h;
        }
    }

    public static void main(String[] args) {
        Node head = new Node.Builder()
                        .append(1)
                        .append(2)
                        .append(3)
                        .append(4)
                        .append(5)
                        .append(6)
                        .append(7)
                        .append(8)
                        .append(9)
                        .append(10)
                        .build();


        for (Node n : head) {
            System.out.println(n);
        }
    }
}
