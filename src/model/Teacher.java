package model;

/**
 * @author  Alberto Cangialosi
 *
 * class Teacher
 * Teacher() - costruttore che inizializza tutti gli attributi (anche nella superclasse)
 * in base ai parametri
 * getClassroom() - getter per l'attributo classe
 * getSalary() - getter per l'attributo stipendio
 * happyBirthday() - metodo per aumentare l'età dell'insegnante di 1 e l'attributo
 * dello stipendio di 1000.
 * toString() - metodo che sovrascrive il metodo toString() della classe Object.
 * Dovrebbe restituire una stringa nella forma "firstName lastName: age (classroom
 * - salary)".
 */
/*
* TODO : refactor this later
* */

//
public class Teacher extends Person {
  public String classroom;
  protected Integer salary;

  public Teacher(Integer ID, String nome, String cognome, Integer età, String email, String num_telefono, String classroom, Integer salary) {
    super(ID, nome,  cognome, età,  email,  num_telefono);
//    // venuto brutto
//    this.classroom = classroom.replace(classroom.substring(0, 1), classroom.substring(0, 1).toUpperCase());
//    // venuto funzionante
//    this.classroom = classroom.substring(0, 1).toUpperCase() + classroom.substring(1);
    // venuto funzionante
    this.classroom = this.upperName(classroom);
    this.salary = salary;
  }

//  public Teacher(String info, String info1, int età, String info2, int i) {
//    super();
//  }

  public String getClassroom() {
    return this.classroom;
  }

  public Integer getSalary() {
    return this.salary;
  }


  @Override
  public String toString() {
    return this.getCognome() + " " +
        this.getNome() + ": " +
        this.getEtà() + " (" +
        "subject = " + this.getClassroom() + ", " +
        "salary = " + String.format("%,d", this.getSalary()) + "€ )";
  }

  @Override
  public void happyBirthday() {
    this.setEtà(this.getEtà() + 1);
    this.salary += 1_000;

    System.out.println("Compleanno! Adesso " + this.toString());
    System.out.println("Ottieni un aumento di 1_000 euro: " + this.getSalary());
  }


  public static void main(String[] args) {
////     fammi fare un upcastin qua e là
//    Person teacher1 = new Teacher("Paul", "MacCartney", 54,  "Musica", 130_000);
//
//    teacher1.happyBirthday();
  }
}


