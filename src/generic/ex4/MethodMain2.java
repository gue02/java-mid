package generic.ex4;

import generic.animal.Dog;
import generic.animal.Cat;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("댕댕이",100);
        Cat cat = new Cat("냐옹이",50);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("찹츄리버",200);
        Dog bigger = AnimalMethod.getBigger(dog,targetDog);
        System.out.println("bigger = " + bigger);
    }
}
