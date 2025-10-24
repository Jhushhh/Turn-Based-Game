class Assassin extends Hero{
    public Assassin(String name){
        super(name, 150, 120);
        skill[0] = new Skill("Quick Stab", 35 , 30);
        skill[1] = new Skill("Shadow strike",70 , 50);
        skill[2] = new Skill("Deadly Ambush", 90, 100);
    }
    @Override
    public void attack(int skillIndex, Hero target) {
        
        super.attack(skillIndex, target);
    }
}