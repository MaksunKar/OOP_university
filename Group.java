import java.util.*;

class Group {
    private Makarovka makarovka;
    private List<Student> students;
    private List<Discipline> disciplines;
    private GradeBook gradeBook;
    private String groupNumber;

    public Group(Makarovka makarovka, String groupNumber) {
        this.makarovka = makarovka;
        this.groupNumber = groupNumber;
        students = new ArrayList<>();
        disciplines = new ArrayList<>();
        gradeBook = new GradeBook();
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Makarovka getMakarovka() {
        return makarovka;
    }

    public void setMakarovka(Makarovka makarovka) {
        this.makarovka = makarovka;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(List<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public GradeBook getGradeBook() {
        return gradeBook;
    }

    public void setGradeBook(GradeBook gradeBook) {
        this.gradeBook = gradeBook;
    }
}
