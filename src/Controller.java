import java.util.ArrayList;

/**
 * @author  Alberto Cangialosi
 * 
 * >>> Alberto : "Manca una slide per le specifiche di cosa fa il Controller"
 * >>> Galluzzo : "..."
 * >>> Galluzzo : "Vai ad intuito"
 *
 * ## UPDATE
 *
 * >>> Galluzzo : "Ho aggiornato le slides con le specifiche di Controller"
 *
 * main() - il metodo principale di questo programma. Dovrebbe semplicemente istanziare una
 * nuova istanza della classe Controller e poi chiamare il metodo run() di tale oggetto.
 * Controller() - il costruttore dell'oggetto Controller. Inizializza l'attributo persons a un array
 * con una dimensione massima di 20 elementi e un oggetto View memorizzato nell'attributo
 * view.
 * run() - questo metodo consiste in un ciclo che esegue il programma finché non viene
 * terminato. Richiama il metodo showMenu() della vista per mostrare un menu all'utente. Infine,
 * analizza la stringa restituita dalla chiamata a showMenu() e chiama altri metodi appropriati
 * nella classe Controller o View per completare l'operazione. Se l'utente digita "exit", il
 * programma termina. In caso contrario, il programma mostrerà ripetutamente il menu
 * all'utente finché non verrà scelto "exit". Se in qualsiasi momento l'utente fornisce un input che
 * non può essere analizzato correttamente, il controllore deve chiamare il metodo showError()
 * della classe View e riavviare il processo (tornando al punto di partenza) mostrando il menu di
 * nuovo.
 *
 * addStudent() - questo metodo riceve la stringa inserita dall'utente nel metodo addStudent() della View, analizza l'input e chiama i metodi appropriati per creare un nuovo oggetto Studente e aggiungerlo al primo slot vuoto dell'array Persone.
 * addTeacher() - questo metodo riceve la stringa inserita dall'utente dal metodo addTeacher() di View, analizza l'input e chiama i metodi appropriati per creare un nuovo oggetto Teacher e aggiungerlo al primo slot vuoto dell'array di Persone.
 * getPersons() - questo metodo restituisce semplicemente l'attributo Person corrente come array. È solo a scopo di test
 * setPersons() - questo metodo sostituisce l'attributo Person con l'array fornito come parametro. Questo metodo è solo a scopo di test.
 */
public class Controller {
//  public ArrayList<Person> persons ;
  public static Integer MAX_P = 20; // maximum number of people

  public Person[] persons ;
  public View view;

  public Controller(/*Person[] persons, View view*/) {
    this.persons = new Person[MAX_P];
    this.view = new View();
  }


  public void addStudent(String input) {
    String[] infos = input.split(" ");

//    // idea: using an ArrayList
//    this.persons.add(new Student(
//            infos[0], // lastName
//            infos[1], // firstName
//            Integer.parseInt(infos[2]), // age
//            Integer.parseInt(infos[3]), // studentID
//            Integer.parseInt(infos[4])  // gradeLevel
//        )
//    );

    // idea using just an array of Person()s
    try {
      for (int i = 0; i < persons.length; i++) {
        if (this.persons[i] == null) {
          this.persons[i] = new Student(
              Integer.parseInt(infos[0]), // ID, pk del db

              infos[1], // nome
              infos[2], // cognome
              Integer.parseInt(infos[3]), // etò
              infos[4], // email
              infos[5], // num_telefono


              Integer.parseInt(infos[6]), // studentID
              Integer.parseInt(infos[7])  // gradeLevel
          );
          break;
        }
      }
    } catch (NumberFormatException ex) {
      System.out.println("Warning, this field accept an Integer number");
    }
  }

  public void addTeacher(String input) {
    String[] infos = input.split(" ");

    try {
      for (int i = 0; i < persons.length; i++) {
        if (this.persons[i] == null) {
          this.persons[i] = new Teacher(
              Integer.parseInt(infos[0]), // ID, pk del db

              infos[1], // nome
              infos[2], // cognome
              Integer.parseInt(infos[3]), // etò
              infos[4], // email
              infos[5], // num_telefono


              infos[6], // classroom
              Integer.parseInt(infos[7].replace("_", ""))  // salary, accettato anche in formato underscore "130_000"
          );

          break;
        }
      }
    } catch (NumberFormatException ex) {
      System.out.println("Warning, this field accept an Integer number");
    }
  }

  public void run() {
    String choice;

    do {
      // mostra menu all'Utente
      choice = this.view.showMenu().toLowerCase();

      // TODO: 23/10/23 : DEBUG : strano, solo qui il `toLowercase` funziona, sia nei return dopo `nextLine` che nelle inizializzazioni degli `infos` invece no, non passa come equals nello switchcase e mi salta al `default` & `showError`
      switch (choice) {
        case "add student":
          // addStudent del Controller prende l'output di addStudent del View
          this.addStudent(this.view.addStudent());
          break;
        case "add teacher":
          this.addTeacher(this.view.addTeacher());
          break;
        case "list people":
//          System.out.println(this.getPersons());

            this.view.listPeople(this.getPersons());
          break;
        case "exit":
          System.out.println("Interrupting by user choice. Bye bye!");
          break;
//        case "exit":
//          choice = "exit";
//          break;
        default:
          this.view.showError("Either a choice not from the menu or a typo. Please enter a valid option");
      }

      System.out.println();
    } while (!choice.equals("exit")) ;
  }


  public Person[] getPersons() {
    return this.persons;
  }

  public void setPersons(Person[] persons) {
    this.persons = persons;
  }

  public static void main(String[] args) {
    Controller cntrlr = new Controller();

//    // TODO : DEBUG : se mi costruisco una lista, le eccezioni non vengono colte qui, ovvio. Ma stranamente neanche mi arriva uno `showError` se poi aggiungo uno studente con la materia o un maestro con uno studentID
//    cntrlr.setPersons(
//        // fammi fare un upcastin qua e là
//        new Person[]{
//            new Student(20, "Gigante", "Nano", 33, 123456, 13),
//            new Teacher(19, "Paul", "MacCartney", 54,  "Musica", 130_000),
//            new Student(18, "Nanno", "Moretto", 22,  134566, 130_000),
//        }
//    );

    cntrlr.run();
  }

}
