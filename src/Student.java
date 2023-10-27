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
public class Student extends Person {
  protected Integer studentID;
  protected Integer gradeLevel;

  public Student(Integer ID, String nome, String cognome, Integer età, String email, String num_telefono, Integer studentID, Integer gradeLevel) {
    super(ID, nome,  cognome, età,  email,  num_telefono);
    this.studentID = studentID;
    this.gradeLevel = gradeLevel;
  }

  public Integer getStudentID() {
    return this.studentID;
  }

  public Integer getGradeLevel() {
    return this.gradeLevel;
  }

  @Override
  public String toString() {
    return this.getCognome() + " " +
        this.getNome() + ": " +
        this.getEtà() + " (" +
        "ID: " + this.getStudentID() + " - " +
        "grade: " + this.getGradeLevel() + ")";
  }
}
