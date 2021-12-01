import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        try {
            System.out.println(main.resultDayOnePartOne(main.getInputFromFile("day-one.txt")));
            System.out.println(main.resultDayOnePartTwo(main.getInputFromFile("day-one.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }

    }

    public ArrayList<Integer> getInputFromFile(String fileName) throws FileNotFoundException {
        ArrayList<Integer> inputList = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            inputList.add(Integer.valueOf(line));
        }
        scanner.close();
        return inputList;
    }

    public int resultDayOnePartOne(ArrayList<Integer> inputList) {
        int result = 0;
        OUTER:
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < inputList.size() - 1; j++) {
                if (inputList.get(i) + inputList.get(j) == 2020) {
                    System.out.println(inputList.get(i) + " + " + inputList.get(j) + " = " + (inputList.get(i) + inputList.get(j)));
                    System.out.println(inputList.get(i) + " * " + inputList.get(j) + " = " + (inputList.get(i) * inputList.get(j)));
                    result = inputList.get(i) * inputList.get(j);
                    break OUTER;
                }
            }

        }
        return result;
    }

    public int resultDayOnePartTwo(ArrayList<Integer> inputList) {
        int result = 0;
        OUTER:
        for (int i = 0; i < inputList.size(); i++) {
            for (int j = 0; j < inputList.size() - 1; j++) {
                for (int k = 0; k < inputList.size() - 2; k++) {
                    if (inputList.get(i) + inputList.get(j) + inputList.get(k) == 2020) {
                        System.out.println(inputList.get(i) + " + " + inputList.get(j) + " + " + inputList.get(k) + " = " + (inputList.get(i) + inputList.get(j) + inputList.get(k)));
                        System.out.println(inputList.get(i) + " * " + inputList.get(j) + " * " + inputList.get(k) + " = " + (inputList.get(i) * inputList.get(j) * inputList.get(k)));
                        result = inputList.get(i) * inputList.get(j) * inputList.get(k);
                        break OUTER;
                    }
                }
            }
        }
        return result;
    }
}
