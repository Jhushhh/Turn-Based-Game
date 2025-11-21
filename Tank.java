class Tank extends Hero {
    private static final int default_hp = 300;
    private static final int default_mp = 100;

    public Tank(String name) {
        super(name, default_hp, default_mp);
        skill = new Skill[] {
                new Skill("Shield Bash", 20, 10),
                new Skill("Ground Slam", 30, 20),
                new Skill("Iron Fist", 40, 30)
        };
    }

    public String[] getSkill() {
        return new String[] {
                skill[0].getSkill_Name(),
                skill[1].getSkill_Name(),
                skill[2].getSkill_Name()
        };
    }

    public Skill[] getSkillsArray() {
        return skill;
    }

    public boolean isTank() {
        return true;
    }
}
