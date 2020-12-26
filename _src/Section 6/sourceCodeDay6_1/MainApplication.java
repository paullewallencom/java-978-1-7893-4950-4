package packt.lambda;

public class MainApplication
{
	public static void main(String[] args)
	{
		Message msg = new Message();
		//msg.printMessage();
		msg.printMessage(new ExecuteMessage()
		{
			public void execute()
			{
				System.out.println("I have injected this into printMessage....>>>>");
			}
		});
		
		System.out.println("\n****************  Lambda Expressions *********************");
		
		msg.printMessage(() -> System.out.println("I have injected this into printMessage....>>>>"));
		
		MyAddLambdaFunction addFunction = (int a, int b) ->(a + b);
	}
}

class Message
{
	public void printMessage(ExecuteMessage em )
	{
		System.out.println("This is Java");
		em.execute();
	}
}

interface ExecuteMessage
{
	public abstract void execute( );
}

interface MyAddLambdaFunction
{
	public abstract int addTwoNumbers(int a, int b);
}
