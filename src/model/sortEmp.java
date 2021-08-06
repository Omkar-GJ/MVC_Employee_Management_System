package model;

import java.util.Comparator;

public class sortEmp  implements Comparator<Employee>{ //Not Use In Project 
	// Not Used Any where

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.Sal>o2.Sal)
			{
				return 1;
			}
			else if(o1.Sal<o2.Sal) {
				return -1;
			}
			else
			{
				return 0;
			}
	}

}
