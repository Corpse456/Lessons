package lesson19.dataStructures;

//import java.util.LinkedList;

public class ListOfIntMain
{

	public static void main(String[] args)
	{
		/*LinkedList spisok = new LinkedList();
		spisok.add(12);
		spisok.add(11);
		spisok.addFirst(88);
		System.out.println(spisok);*/

		ListOfInt spisok = new ListOfInt();
		spisok.print();
		for (int i = 0; i < 10; i++)
		{
			spisok.add(i);
		}
		spisok.print();
		
		spisok.set(56, 6);
		spisok.print();
		
		System.out.println("Get element by index 6: " + spisok.get(6));
		
		spisok.deleteByValue(56);
		spisok.print();
		
		spisok.deleteByIndex(6);
		spisok.print();
		
		spisok.insertToIndex(984, 13);
		spisok.print();
		
		spisok.addFirst(116);
		spisok.print();
		
		spisok.clear();
		spisok.print();
	}
}
