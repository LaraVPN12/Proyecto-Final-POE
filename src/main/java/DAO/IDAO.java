
package DAO;

import java.util.List;

public interface IDAO <T, K>{
    void insert(T o);
    void update(T o);
    void delete(T o);
    List<T> getAll();
    T find (K id);
}
