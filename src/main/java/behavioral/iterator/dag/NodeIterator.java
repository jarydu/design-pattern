package behavioral.iterator.dag;

import java.util.Iterator;

/**
 * Created by jarydu on 3/12/17.
 */
public class NodeIterator implements Iterator<Node> {

    private final Node head;
    private Node current;

    public NodeIterator(Node head) {
        this.head = head;
        this.current = head;
    }

    public boolean hasNext() {
        if (current != null && current.getNext() != null) {
            return true;
        }

        return false;
    }

    public Node next() {
        Node node = current;
        current = current != null ? current.getNext() : null;
        return node;
    }
}
