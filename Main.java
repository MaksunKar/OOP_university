import java.util.*;

public class Main {
    public static void main(String[] args) {
        MakarovkaUniversity dep1 = initMakarovka();
        Student student1 = dep1.getMakarovka().getGroups().get(0).getStudents().get(0);
        student1.getGroup().getMakarovka().getDepartmentMakarovka();

        for (Group group : dep1.getMakarovka().getGroups()) {
            for (Student student : group.getStudents()) {
                System.out.println(student.getName());
            }
        }
        for (Group group : dep1.getMakarovka().getGroups()) {
            for (Discipline discipline : group.getDisciplines()) {
                System.out.print(discipline.getNameDisc() + " ");
                System.out.print(discipline.getTeacher().getName() + " ");
                System.out.print(discipline.getTeacher().getGender());
            }
        }

        dep1.getMakarovka().getGroups().stream()
                .map(group -> group.getStudents())
                .flatMap(Collection::stream)
                .filter(student -> student.getGender() ==  Gender.MALE)
                .map(Student::getName)
                .forEach(System.out::println);

    }

    public static MakarovkaUniversity initMakarovka() {
        MakarovkaUniversity dep = new MakarovkaUniversity();
        Makarovka makarovka = new Makarovka();
        dep.setMakarovka(makarovka);
        makarovka.setDepartmentMakarovka(dep);
        Teacher teacher1 = new Teacher("Анастасия Александровна", makarovka, Gender.FEMALE);
        makarovka.addTeachers(teacher1);
        Teacher teacher2 = new Teacher("Дмитрий Николаевич", makarovka, Gender.MALE);
        makarovka.addTeachers(teacher2);
        Group group = new Group(makarovka,"ИП41");
        makarovka.addGroups(group);
        Student student1 = new Student("Максун", group, Gender.MALE, 23);
        Student student2 = new Student("Влад", group, Gender.MALE,10);
        Student student3 = new Student("Ифриз", group, Gender.FEMALE,50);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        GradeBook gradeBook = new GradeBook();
        gradeBook.setGroup(group);
        group.setGradeBook(gradeBook);
        Discipline discipline = new Discipline(teacher1, "Математика");
        group.addDiscipline(discipline);
        gradeBook.addGrade(student1,discipline,100);
        return dep;
    }
    public static void keysStudent_1(Student student) {
        student.getGroup();
        student.getGroup().getMakarovka().getDepartmentMakarovka();
        student.getGroup().getDisciplines();
        
    }
    public static void keysStudent_2(Discipline discipline) {
        List<Student> students = discipline.getStudents();
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
    public static void keysStudent_3(Teacher teacher) {
        teacher.getMakarovka();
        teacher.getMakarovka().getGroups();
        for (Group group : teacher.getMakarovka().getGroups()) {
            for(Discipline discipline : group.getDisciplines()) {
                if (discipline.getTeacher().equals(teacher)) {
                    discipline.getStudents();
                }
            }
        }
    }
    public static void keysStudent_4(Student student) {
        //первый способ, где оценки, которых нет возвращаются как null
        for (Discipline discipline: student.getGroup().getDisciplines())
         student.getGroup().getGradeBook().getGrade(student,discipline);
        //Второй способ модернизированный
        Map<Discipline, Integer> dispDaGrad = student.getGroup().getGradeBook().getDispGrad(student);
        for (Map.Entry entry: dispDaGrad.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

    }
    public static void keysStudent_5(Discipline discipline) {
        for (Student student: discipline.getStudents()) {
            student.getGroup().getGradeBook().getGrade(student,discipline);
        }

    }
    public static void keysStudent_6(MakarovkaUniversity university) {
       university.getMakarovka().getGroups();
       university.getMakarovka().getTeachers();
       for (Group group: university.getMakarovka().getGroups()) {
           group.getStudents();
           group.getGradeBook();
       }

    }


}
