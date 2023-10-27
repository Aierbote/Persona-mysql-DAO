package datasource;

import java.sql.*;


/***
 * @author Alberto Cangialosi
 * @version 1.0
 * [ ???  @dependency: XAMPP + MySQL Connector Java (Maven Repository)
 *
 * <p>
 *   configurazione di base del connector to MySQL seguendo questo tutorial
 *  </p>
 *   <br>
 *   SOURCE:
 *      <a href="https://www.youtube.com/watch?v=AHFBPxWebFQ">https://www.youtube.com/watch?v=AHFBPxWebFQ&
 *      </a>
 */
public class ConnectionMySQL {
  public static void main(String[] args) {
    // URL al server di prova fatto con XAMPP
    final String URL = "jdbc:mysql://localhost:3306/Persona_for_BUILDER_PATTERN";
    // TODO : temporary login credentials (aka, the safest of them all)
    String username = "root";
    String passwerd = "";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");

      Connection connection = DriverManager.getConnection(URL, username, passwerd);

      Statement statement = connection.createStatement();

      ResultSet resultSet = statement.executeQuery("SELECT * FROM Persona");

      while (resultSet.next()) {
        System.out.println(
            resultSet.getInt(1)  + " " +
            resultSet.getString(2)  + " " +
            resultSet.getString(3)  + " " +
            resultSet.getInt(4)  + " " +
            resultSet.getString(5)  + " " +
            resultSet.getString(6)  + " "
         );
      }

      connection.close();
    }
    
    
    catch (ClassNotFoundException | SQLException e) {
      System.out.println("Catched Exception: \n\t" +  e);
    }
  }

  /* throws-catch SQLException */
}
