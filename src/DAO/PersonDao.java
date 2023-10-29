package DAO;

import datasource.ConnectionMySQL;
import model.Person;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonDao implements CRUD<Person> {
  // TODO: 29/10/23 i metodi specifici per Person che gli saranno necessari

  private final ConnectionMySQL connection = new ConnectionMySQL();

  @Override
  public boolean add(Person person) {
    try {
      // la query per aggiungere una persona
      String insertQuery = "INSERT INTO `Persona`" +
          "(`ID`, `nome`, `cognome`, `età`, `email`, `num_telefono`) " +
          "VALUES (?, ?, ?, ?, ?, ?)";

      // la Statement per inserire i vari dati utente
      PreparedStatement statement = connection.getConnection().prepareStatement(insertQuery);

      statement.setInt(1, person.getID());
      statement.setString(2, person.getNome());
      statement.setString(3, person.getCognome());
      statement.setInt(4, person.getEtà());
      statement.setString(5, person.getEmail());
      statement.setString(6, person.getNum_telefono());

      // l'esecuzione della query
      statement.executeUpdate();

      // chiusura della Statement
      statement.close();

      // chiusura della connection
      statement.close();

      // fine metodo ADD
      return true;
    }
    catch (SQLException ex) {
      System.out.println(ex.getMessage());
      return false;
    }
  }


  // TODO: 29/10/23 : definire per bene anche i metodi fratelli come sopra 
  @Override
  public List<Person> findAll() {
    return null;
  }

  @Override
  public boolean update(Integer ID, Person person) {
    return false;
  }

  @Override
  public boolean delete(Integer ID) {
    return false;
  }
}
