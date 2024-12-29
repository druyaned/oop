package druyaned.designpatterns.behavioral.iterator.src;

/**
 * The Iterator interface declares the operations required for traversing
 * a collection: fetching the next element, retrieving the current position,
 * restarting iteration, etc.
 * 
 * <P>Concrete Iterators implement specific algorithms for traversing
 * a collection. The iterator object should track the traversal progress
 * on its own. This allows several iterators to traverse the same
 * collection independently of each other.
 * 
 * @author druyaned
 * @param <T> type of elements in the {@link Collection collection}
 */
public interface Iterator<T> {
    
    boolean hasNext();
    
    T next();
    
    void reset();
    
}
