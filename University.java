import java.util.*;
public abstract class University {
    private List<Discipline> disciplines;
    private List<Student> students;

    public University() {
        this.disciplines = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public List<Student> getStudents() {
        return students;
    }
}
