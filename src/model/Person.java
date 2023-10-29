package model;

/**
 * @author  Alberto Cangialosi
 *
 * class Student
 * Student() - costruttore che inizializza tutti gli attributi (anche nella superclasse)
 * in base ai parametri
 * getStudentID() - getter per l'attributo studentID
 * getGradeLevel() - getter per l'attributo gradeLevel
 * happyBirthday() - metodo che incrementa l'età e il livello dello studente di 1.
 * toString() - metodo che sovrascrive il metodo toString() della classe Object.
 * Dovrebbe restituire una stringa nella forma "firstName lastName: age (studentID
 * - gradeLevel)".
 */
public class Person {
  private Integer ID;
  private String nome;
  private String cognome;
  private Integer età;
  private String email;
  private String num_telefono;
  public static Integer registrazioni = 0; // TODO: 27/10/23  per provare ad aumentare automaticamente l'Integer ID pk del db 

//  CONSTRUCTOR
  public Person(Integer ID, String nome, String cognome, Integer età, String email, String num_telefono) {
    registrazioni++; // TODO: 27/10/23 ; forse devo proprio cambiarmi questo construttore usando in pratica il newBuilder qui
    
    this.ID = ID;
    this.nome = this.upperName(nome);
    this.cognome = this.upperName(cognome);
    this.età = età;
    this.email = email;
    this.num_telefono = num_telefono;
  }

//  GETTERS

  public String getNome() {
    return this.nome;
  }

  public String getCognome() {
    return this.cognome;
  }

  public Integer getEtà() {
    return this.età;
  }

  public Integer getID() {
    return this.ID;
  }

  public String getEmail() {
    return this.email;
  }

  public String getNum_telefono() {
    return this.num_telefono;
  }

//  SETTERS


  public void setID(Integer ID) {
    this.ID = ID;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public void setEtà(Integer età) {
    this.età = età;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setNum_telefono(String num_telefono) {
    this.num_telefono = num_telefono;
  }

//   OTHER METHODS

  public void happyBirthday() {
    this.età++;
    System.out.println("Compleanno! Adesso " + this.toString());
  }

  @Override
  public String toString() {
    return this.getNome() + ", " + this.getCognome() + " ha "  + this.getEtà() + " anni.";
  }

//   IL/I MIO/MIEI METODO/I

  public String upperName(String word) {
    // TODO: 23/10/23 : aggiungere prima Maiuscola + altre Minuscole 
    return word.substring(0, 1).toUpperCase() + word.substring(1);
  }
}
