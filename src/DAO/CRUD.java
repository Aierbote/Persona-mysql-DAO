package DAO;

import java.util.List;

public interface CRUD<T> {
  boolean add(T t); // create
  List<T> findAll(); // read
  boolean update(Integer ID,T t);
  boolean delete(Integer ID);
}
