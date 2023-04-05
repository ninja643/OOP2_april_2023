package rs.ac.ni.pmf.oop2.april_2023.zad3;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Employee
{
	long id;
	String name;
	Title title;
	int salary;

	public enum Title
	{
		CEO,
		CTO,
		DEVELOPER,
		QA
	}
}
