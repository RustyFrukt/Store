public class lottery {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Фигурка DC", 30, 30);
        Toy toy2 = new Toy(2, "Набор LEGO", 20, 20);
        Toy toy3 = new Toy(3, "Футболка", 100, 70);
        Toy toy4 = new Toy(3, "Воздушный змей", 50, 80);
        Toy toy5 = new Toy(3, "Плюшевый медведь", 100, 90);
        Toy toy6 = new Toy(3, "Anki Cozmo", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}

