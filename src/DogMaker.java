public class DogMaker {
  
  public static void main(String[] args) {
    Dog dog = new Dog(2, "Jill", "black and tan");
    dog.setName("Jessie");
    dog.getAge();
    System.out.println(dog.getAge());
    dog.birthday();
    System.out.println(dog.getAge());
    System.out.println(dog.toString());



    
    
  }
  
}
