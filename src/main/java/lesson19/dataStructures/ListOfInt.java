package lesson19.dataStructures;

public class ListOfInt
{

	private int numbersOElements;
	Elements first;

	public ListOfInt()
	{
		numbersOElements = 0;
		first = null;
	}

	public int get(int index)
	{
		if (index < 0 || index > numbersOElements)
		{
			System.err.println("Wrong index");
			return 0;
		}
		
		if (numbersOElements == 0)
		{
			return first.get();
		}
		
		Elements current = first;
		for (int i = 0; i < index - 1; i++)
		{
			current = current.getNext();
		}		
		return current.get();
	}

	public boolean set(int value, int index)
	{
		if (index < 0 || index > numbersOElements)
		{
			return false;
		}
		
		if (numbersOElements == 0)
		{
			Elements current = new Elements();
			current.set(value);
			current.setNext(null);
			return true;
		}
		
		Elements current = first;
		for (int i = 0; i < index - 1; i++)
		{
			current = current.getNext();
		}
		current.set(value);
		
		return true;
	}

	public boolean insertToIndex(int value, int index)
	{
		if (index < 0 || index > numbersOElements)
		{
			return false;
		}

		if (index == 0 || numbersOElements == 0)
		{
			Elements current = new Elements();
			current.set(value);
			current.setNext(first);
			first = current;
			numbersOElements++;
			return true;
		}

		Elements previous = first;
		for (int i = 0; i < index - 1; i++)
		{
			previous = previous.getNext();
		}

		Elements current = new Elements();
		current.set(value);
		current.setNext(previous.getNext());
		previous.setNext(current);
		numbersOElements++;

		return true;
	}

	public boolean deleteByIndex(int index)
	{
		if (index < 0 || index > numbersOElements || numbersOElements == 0)
		{
			return false;
		}

		Elements previous = first;
		for (int i = 0; i < index - 2; i++)
		{
			previous = previous.getNext();
		}
		Elements current = previous.getNext();
		previous.setNext(current.getNext());;

		numbersOElements--;
		return true;
	}
	
	public boolean deleteByValue(int value)
	{		
		Elements previous = first;
		while (previous.getNext() != null)
		{
			if (previous.getNext().get() == value)
			{
				break;
			}
			previous = previous.getNext();
		}
		Elements current = previous.getNext();
		previous.setNext(current.getNext());;
		
		numbersOElements--;
		return true;
	}

	public void clear()
	{
		first = null;
		numbersOElements = 0;
	}

	public void add(int value)
	{
		Elements current = new Elements();
		if (numbersOElements == 0)
		{
			current.set(value);
			first = current;
			numbersOElements++;
			return;
		}
		
		Elements previous = first;
		while (previous.getNext() != null)
		{
			previous = previous.getNext();
		}

		current.set(value);
		previous.setNext(current);
		numbersOElements++;
	}
	
	public void addFirst(int value)
	{
		Elements current = new Elements();
		current.set(value);
		current.setNext(first);
		first = current;
		numbersOElements++;
	}
	
	public void print()
	{
		Elements element = first;
		
		System.out.print("[ ");
		while (element != null)
		{
			System.out.print(element.get());
			element = element.getNext();
			if (element != null)
			{
				System.out.print(" | ");
			}
		}
		System.out.print(" ]");
		System.out.println();
	}
}
