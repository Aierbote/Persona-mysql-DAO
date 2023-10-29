/**
 * @author Alberto Cangialosi
 *
 * Per costruiere un'instanza di Student con il Design Pattern **Builder**
 * <br>
 * @see PersonBuilder
 */
public class StudentBuilder extends PersonBuilder {
//  private PersonBuilder persBuild; /*  = new PersonBuilder(); */
  private Integer studentID;
  private Integer gradeLevel;

//  private StudentBuilder(Integer ID) {
//    super(ID);
//    persBuild = new PersonBuilder(ID);
//  }

  public StudentBuilder studentID(Integer studentID) {
    this.studentID = studentID;
    return this;
  }

  public StudentBuilder gradeLevel(Integer gradeLevel) {
    this.gradeLevel = gradeLevel;
    return this;
  }

  @Override
  public Student build() {
    // TODO: DEBUG :
    System.out.println("sto usando uno builder: StuentBuilder");

//    // versione 1 : NON FUNZIONAva
//    PersonBuilder persBuild = new PersonBuilder();

//    // versione 2 : NON FUNZIONAva
//    Person pers = new PersonBuilder().build();

    // VERSIONE 3 : ...???
    Person pers = super.build();

    return new Student(pers, studentID, gradeLevel);
  }

//  public StudentBuilder(Integer ID, String nome, String cognome, Integer età, String email, String num_telefono, Integer studentID, Integer gradeLevel) {
//    super(ID, nome,  cognome, età,  email,  num_telefono);
//    this.studentID = studentID;
//    this.gradeLevel = gradeLevel;
//  }


//  public static void main(String[] args) {
//    StudentBuilder studBuild = (
//        // part1: sembra che devo fare un casting della sua stessa classe per usare l'ereditarietà di PersonBuilder
//        (StudentBuilder) new StudentBuilder()
//          // part 2: nello specifico per usare questo newBuilder di PersonBuilder
//          .newBuilder(2)
//          .name("Gino")
//          .surname("Pulcino")
//          .age(1)
//          .email("nonSonoPulcinoPio@chicken.coop")
//          .phoneNumber("+3913245768")
//        )
//        .studentID(123456)
//        .gradeLevel(0)
//    ;
//
//    Student studConBuilder = studBuild.build();
//
//    System.out.println("built studConBuilder:\n\t" + studConBuilder);
//  }

}
