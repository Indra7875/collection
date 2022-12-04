package programs.Java8Features_Programs.BiFunctional_Interface;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Demo2_BiFunction {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(11,"Ramesh"));
        studentList.add(new Student(12,"Suresh"));
        studentList.add(new Student(13,"Rohit"));
        studentList.add(new Student(14,"Mahesh"));
        studentList.add(new Student(15,"Ruturaj"));
        
        ArrayList<Department> departmentList = new ArrayList<Department>();
        departmentList.add(new Department(01,"Physics"));
        departmentList.add(new Department(02,"Maths"));
        departmentList.add(new Department(03,"Chemistry"));
        departmentList.add(new Department(04,"History"));

        ArrayList<Sheet> listOfSheets = new ArrayList<Sheet>();

        BiFunction<ArrayList<Department>,ArrayList<Student>,ArrayList<Sheet>> biFunction = (dlist, slist) ->{

            listOfSheets.add(new Sheet(dlist.get(0).deptId, dlist.get(0).deptName, slist.get(0).studentId, slist.get(0).studentName));
            listOfSheets.add(new Sheet(dlist.get(1).deptId, dlist.get(1).deptName, slist.get(1).studentId, slist.get(1).studentName));
            listOfSheets.add(new Sheet(dlist.get(2).deptId, dlist.get(3).deptName, slist.get(2).studentId, slist.get(2).studentName));
            listOfSheets.add(new Sheet(dlist.get(3).deptId, dlist.get(3).deptName, slist.get(3).studentId, slist.get(3).studentName));
            listOfSheets.add(new Sheet(dlist.get(0).deptId, dlist.get(0).deptName, slist.get(4).studentId, slist.get(4).studentName));

            return listOfSheets;
        };

        biFunction.apply(departmentList,studentList);
        System.out.println(listOfSheets);
    }
}
