public class Program
{
  public static void Main(string[] args)
  {
    User user = new User("Devesh", 21);
    user.Username = "Devesh Shetty";
    System.Console.WriteLine(user.Username);
  }
}