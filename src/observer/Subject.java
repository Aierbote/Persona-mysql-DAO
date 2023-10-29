package observer;

public interface Subject {
  // registriamo e cancelliamo i Subject (per es. potrebbero essere gli utenti)
  public void register(Observer obser);
  public void unregister(Observer obser);

  // notifichiamo i Subject
  public void notifyObservers();
  // per prendere gli update da Subject
  public void getUpdate(Observer obser);
}
