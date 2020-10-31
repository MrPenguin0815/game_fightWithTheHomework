public class Character {
    private String name;
    private int hitPoints;
    private int attack;
    private int defense;


    public void skill(Monster m1) {
        int damage = (int) (Math.random() * attack + 20 - m1.getDefense());
        m1.setHitPoints(m1.getHitPoints() - damage);
        System.out.println(this.name + "发动普攻，造成" + damage + "点伤害");
    }//对怪物造成伤害

    public void skill1(Monster m1) {
        int damage = (int) (Math.random() * attack + 120 - m1.getDefense());
        m1.setHitPoints(m1.getHitPoints() - damage);
        System.out.println(this.name + "发动技能一，造成" + damage + "点伤害");
    }//对怪物造成的伤害增加100



    public void skill2(Monster m1) {
        int damage = (int) (Math.random() * attack + 20) * 3 - m1.getDefense();
        m1.setHitPoints(m1.getHitPoints() - damage);
        System.out.println(this.name + "发动技能二，造成" + damage + "点伤害");
    }//对怪物造成的伤害增加200%



    public void skill3(Monster m1) {
    m1.setDefense(m1.getDefense() - 10);
    System.out.println(this.name + "发动技能三，" + m1.getName() + "当前防御力为" + m1.getDefense());
    }//使怪物防御下降10点


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
