package dataProviders;

import org.testng.annotations.DataProvider;

public class AddEmployeeDataProvider {
@DataProvider(name="employeeDetails")
public static Object[][] getEmployeeDetails() {
	return new Object[][] {
		{"Surya", "","kumar","EMP_001"},
		{"Suresh", "","kumar", "EMP_002"},
		{"Ramesh", "","kumar", "EMP_003"},
		{"Rajesh", "","kumar", "EMP_004"},
		{"Ramesh","sachin","Tendulkar", "EMP005"}
	};
}
}
