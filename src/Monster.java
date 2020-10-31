public class Monster {
    private String name;
    private int hitPoints;
    private int attack;
    private int defense;


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

    public void skill(Character c1) {
        int damage = (int) (Math.random() * attack + 40 - c1.getDefense());

        if(damage <= 0){
            System.out.println(this.name + "发动普攻，造成0点伤害");
        }else{
            c1.setHitPoints(c1.getHitPoints() - damage);
            System.out.println(this.name + "发动普攻，造成" + damage + "点伤害");
        }

    }






}
