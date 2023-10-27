package DAO;

import java.util.List;

public interface CRUD<T> {
  boolean addU(T t); // create
  List<T> findAll(); // read
  boolean updaate(Integer ID,T t);
  boolean delete(Integer ID);
}
