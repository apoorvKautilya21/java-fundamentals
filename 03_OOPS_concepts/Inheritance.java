class SchoolInheritance {
  private String name;

  SchoolInheritance(String name) {
    this.name = name;
    System.out.println("Constructor of SchoolInheritance called");
  }

  public void displaySchoolName() {
    System.out.println("School Name: " + name);
  }
}

class StudentInheritance extends SchoolInheritance {
  private String studentName;

  StudentInheritance(String schoolName, String studentName) {
    super(schoolName);
    this.studentName = studentName;
    System.out.println("Constructor of StudentInheritance called");
  }

  public void displayStudentName() {
    System.out.println("Student Name: " + studentName);
  }
}

class ParentInheritance extends StudentInheritance {
  private String parentName;

  ParentInheritance(String schoolName, String studentName, String parentName) {
    super(schoolName, studentName);
    this.parentName = parentName;
    System.out.println("Constructor of ParentInheritance called");
  }

  public void displayParentName() {
    System.out.println("Parent Name: " + parentName);
  }
}

class Teacher extends SchoolInheritance {
  private String teacherName;

  Teacher(String schoolName, String teacherName) {
    super(schoolName);
    this.teacherName = teacherName;
    System.out.println("Constructor of Teacher called");
  }

  public void displayTeacherName() {
    System.out.println("Teacher Name: " + teacherName);
  }
}

public class Inheritance {
  public static void main(String[] args) {
    StudentInheritance student = new StudentInheritance("ABC School", "John Doe");
    student.displaySchoolName();
    student.displayStudentName();

    ParentInheritance parent = new ParentInheritance("ABC School", "John Doe", "Jane Doe");
    parent.displaySchoolName();
    parent.displayStudentName();
    parent.displayParentName();

    Teacher teacher = new Teacher("ABC School", "Mr. Smith");
    teacher.displaySchoolName();
    teacher.displayTeacherName();

    SchoolInheritance school = new StudentInheritance("XYZ School", "Alice");
    school.displaySchoolName();
    // school.displayStudentName(); // This line will cause a compile-time error
    // because the reference type is SchoolInheritance and the object is of type StudentInheritance
  }
}
