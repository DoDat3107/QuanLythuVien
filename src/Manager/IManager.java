package Manager;

import java.util.ArrayList;

public interface IManager<E> {
    void  add(E e);
    void remove(int id);
    void update(int id, E e);
    int FindById(int id);
    ArrayList<E>FindAll();
}
