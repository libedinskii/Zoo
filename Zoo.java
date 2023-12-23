import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooKeeper {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void feedAnimal(Animal animal) {
        System.out.println("Feeding " + animal.getName());
    }

    @Override
    public void cleanEnclosure(Animal animal) {
        System.out.println("Cleaning enclosure for " + animal.getName());
    }
}
