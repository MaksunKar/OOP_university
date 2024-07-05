import java.util.*;
class GradeBook {
    private Group group;
    private Map<Student, Map<Discipline, Integer>> grades = new HashMap<>();


    public void addGrade(Student student, Discipline discipline, int grade) {
        Map<Discipline, Integer> disciplineGrades = grades.getOrDefault(student, new HashMap<>());
        disciplineGrades.put(discipline, grade);
        grades.put(student, disciplineGrades);
    }
    public Group getGroup() {
        return group;
    }
    public void setGroup(Group group) {
        this.group = group;
    }

    public Map<Discipline, Integer> getDispGrad(Student student) {
        return grades.get(student);
    }

    public Integer getGrade(Student student, Discipline discipline) {
        Map<Discipline, Integer> disciplineGrades = grades.getOrDefault(student, new HashMap<>());
        return disciplineGrades.get(discipline);
    }
}
