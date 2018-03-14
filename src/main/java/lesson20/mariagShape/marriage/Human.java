package lesson20.mariagShape.marriage;

public class Human
{
	private char sex;
	private String name;
	private Human whoHeLikes;
	private static int count = 0;

	public Human()
	{
		sex = (Math.random() > 0.5) ? 'M' : 'F';
		name = (sex == 'M') ? "Vasya " + count : "Masha " + count;
		count++;
		whoHeLikes = null;
	}

	public char getSex()
	{
		return sex;
	}

	public void setSex(char sex)
	{
		this.sex = sex;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Human getWhoHeLikes()
	{
		return whoHeLikes;
	}

	public void setWhoHeLikes(Human whoHeLikes)
	{
		this.whoHeLikes = whoHeLikes;
	}

	public void print()
	{
		if (whoHeLikes == null)
		{
			System.out.println("I'm " + name + ". I love " + whoHeLikes);
		}
		else
		{
			System.out.println("I'm " + name + ". I love " + whoHeLikes.name);
		}
	}
}
