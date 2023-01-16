

public class MainApp {
    public static void main(String[] args) {

        Person [] persons = GeneratingObjects.Generate(6);

        for (Person person:persons) {
            person.printAccountInfo();
        }

        persons[1].stepsCount += 1000;
        persons[1].weight += 5;
        persons[1].printAccountInfo();

        persons[3].surname = "Bing";
        persons[3].printAccountInfo();

    }


}
