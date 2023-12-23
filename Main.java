public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр зоопарка
        Zoo zoo = new Zoo();

        // Создаем экземпляры животных
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 3);

        // Добавляем животных в зоопарк
        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);

        // Выполняем действия смотрителя зоопарка
        zoo.feedAnimal(lion);
        zoo.cleanEnclosure(elephant);
    }
}
