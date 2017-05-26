public class User{

  private String username;

  private int age;

  public User(String username, int age){
    this.username = username;
    this.age = age;
  }

  public void setUsername(String username){
    this.username = username;
  }

  //package-scoped setter
  void setAge(int age){
    if(age < 0){
      //instead throw an IllegalArgumentException
      this.age = 0;
    }
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }

  public String getUsername(){
    return this.username;
  }

}