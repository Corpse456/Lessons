package lesson13.compare;

import java.util.Scanner;

public class Chess
{
	private static String[][] chessBoard;
	static final String[] PIECES = { "WP", "WR", "WH", "WB", "WQ", "WK", "WB", "WH", "WR",
			"BP", "BR", "BH", "BB", "BQ", "BK", "BB", "BH", "BR"};

	public static void main(String[] args)
	{
		initBoard();
		print2d(chessBoard);
		while(true)
		{
			Scanner in = new Scanner (System.in);
			System.out.println("Please enter coordinate from: ");
			int from = in.nextInt();
			System.out.println("Please enter coordinate to: ");
			int to = in.nextInt();
			makeMove(from,to);
			print2d(chessBoard);
			in.close();
		}
	}

	private static void makeMove(int from, int to)
	{
		//из фром достать 2 координаты
		//из ту достать две координаты
		//в массиве чесбоард переставить нужный стринг в нужное место
		//на месте где была строка фигура поставить array[i][j] == null
		//добавить выход из цикла по желанию пользователя
	}

	private static void initBoard()
	{
		chessBoard = new String[8][8];
		for (int i = 0; i < 8; i++)
		{
			chessBoard[0][i] = PIECES[i + 1];
			chessBoard[1][i] = PIECES[0];
			chessBoard[6][i] = PIECES[9];
			chessBoard[7][i] = PIECES[i + 10];
		}
	}

	public static void print2d(String[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if (array[i][j] == null)
				{
					System.out.print("   | ");
				}
				else
				{
					System.out.print(array[i][j] + " | ");
				}
			}
			System.out.println();
		}
	}
	
	/*private static void swap(int i, int j, int[] array)
	{
		int change = array[i];
		array[i] = array[j];
		array[j] = change;
	}*/

}
