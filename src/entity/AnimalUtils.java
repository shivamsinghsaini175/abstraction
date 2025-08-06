package abstraction.src.entity;

public class AnimalUtils {
    public void addAnimal(Animal animal)
    {
        System.out.println("Animal added "+ animal.getName());

        animal.makeNoise();

        if (animal instanceof Cat)
        {
            Cat cat=(Cat) animal;
            cat.jump();
        }
        else if(animal instanceof Dogs){
            Dogs dogs=(Dogs) animal;
            dogs.play();
        }
        else if(animal instanceof Parrot)
        {
            Parrot par=(Parrot) animal;
          //  par.flyable(animal.getName());
        }

        // animal.eat();
    }
}
