import java.util.Scanner;

class SelectionContext {

    private PersonSelectionAlgorithm algorithm;




    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        // write your code here
        this.algorithm = algorithm;
    }

    public Person[] selectPersons(Person[] persons) {
        // write your code here
        return algorithm.select(persons);
    }
}

interface PersonSelectionAlgorithm {

    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {
    int step;
    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        this.step = step;
    }

    @Override
    public Person[] select(Person[] persons) {
        Person[] chosenOnes = new Person[persons.length % step == 0 ?
                persons.length / step : persons.length / step + 1];

        if (step == 1) {
            chosenOnes = persons.clone();
        } else {
            int index = 0;
            for (int i = 0; i < persons.length; i++) {
                if (i % step == 0) {
                    chosenOnes[index] = persons[i];
                    index++;
                }
            }
        }
        return chosenOnes;
    }
}


class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {

    int count;
    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        this.count = count;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        Person[] chosenOnes = new Person[count];

        if (count == 1 || persons.length == 1) {
            chosenOnes = persons.clone();
        } else {
            System.arraycopy(persons, persons.length - count, chosenOnes, 0, count);
        }

        return chosenOnes;
    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int count = Integer.parseInt(scanner.nextLine());
        final Person[] persons = new Person[count];

        for (int i = 0; i < count; i++) {
            persons[i] = new Person(scanner.nextLine());
        }

        final String[] configs = scanner.nextLine().split("\\s+");

        final PersonSelectionAlgorithm alg = create(configs[0], Integer.parseInt(configs[1]));
        SelectionContext ctx = new SelectionContext();
        ctx.setAlgorithm(alg);

        final Person[] selected = ctx.selectPersons(persons);
        for (Person p : selected) {
            System.out.println(p.name);
        }
    }

    public static PersonSelectionAlgorithm create(String algType, int param) {
        switch (algType) {
            case "STEP": {
                return new TakePersonsWithStepAlgorithm(param);
            }
            case "LAST": {
                return new TakeLastPersonsAlgorithm(param);
            }
            default: {
                throw new IllegalArgumentException("Unknown algorithm type " + algType);
            }
        }
    }
}