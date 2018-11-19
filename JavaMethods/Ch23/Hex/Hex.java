/*
 * This program tests whether there is a win in a
 * game of Hex position
 */

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Hex
{
  public static HexBoard read(String fileName)
  {
    Scanner inputFile = null;
    try
    {
      inputFile =
               new Scanner(new FileReader(fileName));
    }
    catch (IOException ex)
    {
      System.out.println("*** Cannot open " + fileName + " ***");
    }

    int rows = inputFile.nextInt();
    int cols = inputFile.nextInt();
    inputFile.nextLine();

    HexBoard board = new HexBoard(rows, cols);

    String str;
    for (int r = 0; r < rows && (str = inputFile.nextLine()) != null; r++)
    {
      for (int c = 0; c < cols && c < str.length(); c++)
      {
        char ch = str.charAt(c);
        if (ch == 'B')
          board.setBlack(r, c);
        else if (ch == 'W')
          board.setWhite(r, c);
      }
    }
    return board;
  }

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    System.out.print("File name: ");
    String   fileName = kb.nextLine().trim();

    HexBoard board = read(fileName);
    System.out.println("\nBoard from file:\n");
    System.out.println(board + "\n");

    // Test blackHasWon:

    System.out.println("blackHasWon = " + board.blackHasWon() + "\n");
    System.out.println("Board after test (unchanged):\n");
    System.out.println(board + "\n");

    // Test areaFill:

    System.out.println("Area fill test");
    System.out.println("Pick a black hexagon");
    System.out.print("row: ");
    int r = kb.nextInt();
    System.out.print("col: ");
    int c = kb.nextInt();
    System.out.println();
    board.areaFill(r, c);
    System.out.println(board + "\n");
  }
}
