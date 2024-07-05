class Teacher implements People {
    private String name;
    private Makarovka makarovka;
    private Gender gender;

    public Teacher(String name, Makarovka makarovka, Gender gender) {
        this.name = name;
        this.makarovka = makarovka;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Makarovka getMakarovka() {
        return makarovka;
    }

    public void setMakarovka(Makarovka makarovka) {
        this.makarovka = makarovka;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
