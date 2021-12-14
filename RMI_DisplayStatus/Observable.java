




import java.util.Observer;
import java.util.ArrayList;
/**
 * Write a description of class Observable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  public abstract class Observable implements IObservable {
      
    private ArrayList<Observer> observerList = new ArrayList<>();
    //no constructor because no need to create instances
    public Observable() {
        super();
    }

    //methods for observer design pattern
    /**
     * add an observer to the list of observers
     * @param observer to add it to observer list
     */
    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    /**
     * remove an observer from the list of observers
     * @param observer to delete it to observer list
     */
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

   
}
