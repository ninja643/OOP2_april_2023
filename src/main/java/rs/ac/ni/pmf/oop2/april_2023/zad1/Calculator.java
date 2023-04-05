package rs.ac.ni.pmf.oop2.april_2023.zad1;

import java.util.Set;

public interface Calculator<T, R>
{
	void addOperand(T operand);

	void removeLastOperand();

	void setOperation(Character operation);

	Set<Character> getAvailableOperations();

	R calculate();
}
