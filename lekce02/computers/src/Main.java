import com.engeto.computers.Computer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Computer frantuvLaptop;
        Computer computer2, computer3;

        // Vytvoření objektů:
        frantuvLaptop = new Computer();
        computer2 = new Computer();
        computer3 = frantuvLaptop;

        new Computer();
        // Vznikne objekt, ale hned se
        //  zase uvolní z paměti - na nic!

        computer2 = computer3;

        computer2.setModel("ABC SuperComp");
        System.out.println(computer2.getModel());
        String model = computer3.getModel();
        System.out.println(model);

        System.out.println(computer2.getWeight());

        Computer computer4 =
                new Computer("XYZ Delta 1", 2.5,
                        15.6, true);
        Computer computer5 =
                new Computer("XYZ Delta 2", 1.5);

        System.out.println(computer5.getModel());

        ArrayList<Computer> listOfComputers = new ArrayList<>();
        listOfComputers.add(frantuvLaptop);
        listOfComputers.add(computer4);
        listOfComputers.add(new Computer("X", 1.0));

        for (int i = 0; i < 100; i++) {
            listOfComputers.add(new Computer());
        }

        System.out.println(
                "50. počítač v seznamu je typu: "
                        +listOfComputers.get(49).getModel());

        listOfComputers.remove(14);
        listOfComputers.add(14, new Computer());
        listOfComputers.set(14, computer5);

        for (Computer computer : listOfComputers) {
            System.out.println(
                    computer.getModel()+ "("+ computer.getWeight() + " kg)");
        }

        listOfComputers.clear(); // Smaž všechny
        System.out.println(listOfComputers.size());
    }
}