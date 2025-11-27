package heroes;           
import skills.Skill;

public class Mage extends Hero {
    private static final int default_hp = 120;
    private static final int default_mp = 200;

    public Mage(String name) {
        super(name, default_hp, default_mp);
        skill = new Skill[] {
                new Skill("FireBall", 30, 20),
                new Skill("Earthquake", 15, 20),
                new Skill("Thunder Bolt", 50, 80)
        };
    }

    public boolean isTank() {
        return false;
    }

    public String[] getSkill() {
        return new String[] {
                skill[0].getSkill_Name(),
                skill[1].getSkill_Name(),
                skill[2].getSkill_Name()
        };
    }

   public double getAttackMultiplier() {
        return 1.0;
    }

    
    public int getDefense(){
        return 8;
    }
}