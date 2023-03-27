import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> listOne = new ArrayList<String>();
    List<String> listTwo = new ArrayList<String>();

    try (Scanner firstInput = new Scanner(System.in)) {
      System.out.println("Quais são os itens da primeira lista?");
      String[] inputOne = (firstInput.nextLine()).split(", ");

      for (int i = 0; i < inputOne.length; i++) {
        listOne.add(inputOne[i]);
      }

      try (Scanner secondInput = new Scanner(System.in)) {
        System.out.println("Quais são os itens da segunda lista?");
        String[] inputTwo = (secondInput.nextLine()).split(", ");

        for (int i = 0; i < inputTwo.length; i++) {
          listTwo.add(inputTwo[i]);
        }

        for (int i = 0; i < inputOne.length; i++) {
          String wordOne = listOne.get(i);
          for (int j = 0; j < inputTwo.length; j++) {
            String wordTwo = listTwo.get(j);

            if (wordOne.equals(wordTwo)) {
              System.out.println(wordOne);
            }
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
