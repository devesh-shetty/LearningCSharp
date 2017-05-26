/*
A model class to demonstrate C# properties
 */
class User
{
  public string Username { get; set; }

  //project scoped setter
  public int Age{ get; internal set; }

  public User(string username, int age)
  {
    this.Username = username;
    this.Age = age;
  }

}