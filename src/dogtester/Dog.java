package dogtester;

public class Dog 
{
  private String dogName, dogBreed;
  private int aggression, hunger;

  public Dog() 
  {
    dogName = "Rufus Doe";
    dogBreed = "Unknown Breed";
    aggression = 0;
    hunger = 0;
  }
  public Dog (String dgName, String dgBreed, int agg, int hung) 
  {
    dogName = dgName;
    dogBreed = dgBreed;
    aggression = agg;
    hunger = hung;
  }
  public Dog(String dgName, String dgBreed) 
  {
    dogName = dgName;
    dogBreed = dgBreed;
    aggression = (int) (Math.random() * 10) + 1;
    hunger = (int) (Math.random() * 10) + 1;
  }

  public void barkFriendly() 
  {
    System.out.println("Arf! Arf!");
  }
  public void barkAngry() 
  {
    System.out.println("GRR! RRRFFF!");
  }

  public String toString() 
  {
    String output = "Name: " + dogName + "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    return output;
  }
}