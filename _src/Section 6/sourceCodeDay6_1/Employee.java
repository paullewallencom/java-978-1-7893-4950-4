package packt.lambda;

public class Employee
{
	private String firstName;
	private String surname;
	
	public Employee(String firstName, String surname)
	{
		this.firstName = firstName;
		this.surname = surname;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	@Override
	public String toString()
	{
		return "Employee [firstName=" + firstName + ", surname=" + surname + "]";
	}
	
}
