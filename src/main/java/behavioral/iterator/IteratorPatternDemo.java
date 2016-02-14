package behavioral.iterator;

/**
 * Created by jarydu on 2/14/16.
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext();)
            System.out.println("Name: " + iter.next());

    }
}
