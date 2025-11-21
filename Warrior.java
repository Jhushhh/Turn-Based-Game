class Warrior extends Hero {
    private static final int default_hp = 200;
    private static final int default_mp = 100;

    public Warrior(String name) {
        super(name, default_hp, default_mp);
        skill = new Skill[] {
                new Skill("Slash", 30, 10),
                new Skill("Power Strike", 60, 30),
                new Skill("Tornado Slash", 50, 35)
        };
    }

    public String[] getSkill() {
        return new String[] {
                skill[1].getSkill_Name(),
                skill[2].getSkill_Name(),
                skill[3].getSkill_Name()
        };
    }

    public boolean isTank() {
        return false;
    }

    public Skill[] getSkillsArray() {
        return skill;
    }
}
