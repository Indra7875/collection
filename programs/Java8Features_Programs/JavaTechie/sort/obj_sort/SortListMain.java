package programs.Java8Features_Programs.JavaTechie.sort.obj_sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
//        return e1.getSalary() > e2.getSalary() ? 1 : e1.getSalary() < e2.getSalary() ? -1 : 0;
        return (int) (e1.getSalary() - e2.getSalary());

    }
}

public class SortListMain {
    public static void main(String[] args) {
        List<Employee> employeeList = DataBase.getEmployees();

        System.out.println(employeeList);

        Collections.sort(employeeList,new SalaryComparator());
        System.out.println(employeeList);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int) (e2.getSalary() - e1.getSalary());
            }
        });

        System.out.println(employeeList);


        Collections.sort(employeeList,(e1,e2) -> e1.getName().compareTo(e2.getName()));
        System.out.println(employeeList);

        Collections.sort(employeeList,Comparator.comparing(Employee::getId).reversed());
        System.out.println(employeeList);



        List<Employee> employeeListDept = employeeList.stream().sorted((e1,e2) -> e1.getDept().compareTo(e2.getDept())).collect(Collectors.toList());
        System.out.println(employeeListDept);

        List<Employee> employeeListDeptRev = employeeList.stream().sorted(Comparator.comparing(Employee::getDept).reversed()).collect(Collectors.toList());
        System.out.println(employeeListDeptRev);
    }
}
