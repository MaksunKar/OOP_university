class Student implements People{
    private String name;
    private Group group;
    private Gender gender;
    private int age;
    public Student(String name, Group group, Gender gender, int age) {
        this.name = name;
        this.group = group;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
