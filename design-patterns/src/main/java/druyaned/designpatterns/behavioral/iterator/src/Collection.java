package druyaned.designpatterns.behavioral.iterator.src;

/**
 * The Collection interface declares one or multiple methods for getting
 * iterators compatible with the collection. Note that the return type of
 * the methods must be declared as the iterator interface so that the concrete
 * collections can return various kinds of iterators.
 * 
 * <P>Concrete Collections return new instances of a particular concrete
 * iterator class each time the client requests one. You might be wondering,
 * where’s the rest of the collection’s code? Don’t worry, it should be in
 * the same class. It’s just that these details aren’t crucial to the actual
 * pattern, so we’re omitting them.
 * 
 * @author druyaned
 * @param <T> type of elements in this collection
 */
public interface Collection<T> {
    
    boolean add(T newElement);
    
    T get(int i);
    
    int size();
    
    Iterator<T> iterator();
    
}
