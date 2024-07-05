import java.util.*;

class Discipline {
    private Teacher teacher;
    private String disc;
    private List<Student> students;

    public Discipline(Teacher teacher, String disc) {
        this.teacher = teacher;
        this.disc = disc;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getNameDisc() {
        return disc;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(String studentName) {
        Student student = new Student(studentName, null, Gender.MALE, 0);
        students.add(student);
    }

    public void addStudent(String studentName, Gender studentGender) {
        Student student = new Student(studentName, null, studentGender, 0);
        students.add(student);
    }

    public void addStudent(String studentName, Gender studentGender, int studentAge) {
        Student student = new Student(studentName, null, studentGender, studentAge);
        students.add(student);
    }
}
