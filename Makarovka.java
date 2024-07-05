import java.util.*;
class Makarovka implements Department{
    private MakarovkaUniversity department;
    private List<Group> groups = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public MakarovkaUniversity getDepartmentMakarovka() {
        return department;
    }

    public void setDepartmentMakarovka(MakarovkaUniversity department) {
        this.department = department;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroups(Group group) {
        groups.add(group);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
}
