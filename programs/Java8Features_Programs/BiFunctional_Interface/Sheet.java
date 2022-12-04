package programs.Java8Features_Programs.BiFunctional_Interface;

public class Sheet {
    int studentId;
    String studentName;
    int deptId;
    String deptName;

    Sheet(int deptId, String deptName, int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Sheet{" + "Department Id=" + deptId + ", Department Name='" + deptName + '\'' + ", Student Id=" + studentId + ", Student Name='" + studentName + '\'' + '}'+'\n';

    }
}
