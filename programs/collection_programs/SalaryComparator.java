package programs.collection_programs;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (emp1.empSal == emp2.empSal) ? 0 : (emp1.empSal > emp2.empSal) ? 1 : -1;

    }

}
