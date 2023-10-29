package observer;

public class ConcreteObserver implements Observer{
  private String emailUser;
  private String newUser;


  public ConcreteObserver(String email_user, String new_user) {
    this.emailUser = email_user;
    this.newUser = new_user;
  }


  @Override
  public void update() {

  }

  @Override
  public void setSubject(Subject sub) {

  }

  public String getEmailUser() {
    return emailUser;
  }

  public void setEmailUser(String emailUser) {
    this.emailUser = emailUser;
  }

  public String getNewUser() {
    return newUser;
  }

  public void setNewUser(String newUser) {
    this.newUser = newUser;
  }
}
