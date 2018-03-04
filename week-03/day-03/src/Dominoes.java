import java.util.ArrayList;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    //orderingDominoes(dominoes);
    System.out.println(orderingDominoes(dominoes));
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }

  public static List orderingDominoes(List<Domino>sixDominoes) {

    for(int i = 0; i < sixDominoes.size(); i++) {
      for(int j = 1; j < sixDominoes.size(); j++) {
        if (sixDominoes.get(i).getValues()[1] == sixDominoes.get(j).getValues()[0]) {
          sixDominoes.add(i + 1, sixDominoes.get(j));
          sixDominoes.remove(j + 1);
        }
      }
    }
    return sixDominoes;
  }
}

/*  I have six dominoes. I take the first one (i = 0), and I compare it with the others, starting from the second one
    (j = 1). I compare the right side of the first domino sixDominoes.get(i).getValues()[1] ([1] meaning the right side)
    with the left side of the other dominoes sixDominoes.get(j).getValues()[0] ([0] meaning the left side). When they
    are equal I add the jth domino to the i+1th place of the list -> sixDominoes.add(i + 1, sixDominoes.get(j)).
    I have now one more dominoes in the list, because the original stayed at place. I have to remove it, and since there
    are one more dominoes before it in the list, it is now at place j + 1, so I remove it from there:
    sixDominoes.remove(j + 1)
 */