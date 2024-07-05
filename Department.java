import java.util.List;

interface Department {
    List<Group> getGroups();
    void addGroups(Group group);
    List<Teacher> getTeachers();
    void addTeachers(Teacher teacher);

}
