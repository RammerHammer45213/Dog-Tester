package dogtester;

public class DogTester 
{
  public static void main(String[] args) 
  {
    Dog dog1 = new Dog("Rover", "Spaniel", 8, 4);
    Dog dog2 = new Dog("Spot", "Border Collie");
    Dog dog3 = new Dog();

    System.out.println(dog1.toString());
    System.out.println("--------------------------");

    System.out.println(dog2.toString());
    System.out.println("--------------------------");

    System.out.println(dog3);
    System.out.println("--------------------------");

    dog1.barkFriendly();
    dog2.barkAngry();
  }
}