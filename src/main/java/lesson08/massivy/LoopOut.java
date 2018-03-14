package lesson08.massivy;

public class LoopOut
{
	public static void main(String[] args)
	{
		external: for (int i = 0; i < 10; i++)
		{
			internal: for (int j = 0; j < 10; j++)
			{
				if (Math.random() > 0.5)
				{
					break external;
				}
				else
				{
					continue internal;
				}
			}
		}
	}

}
