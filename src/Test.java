public class Test {


    public static void main(String[] args) {
        Monster mon = new Monster();
        Character cha = new Character();


        System.out.println("请输入角色姓名（不超过五个字）：");
        String chaName = Utility.readString(5);
        cha.setName(chaName);
        System.out.println("请输入角色血量（1-999）：");
        int chaHitPoints = Utility.readInt1();
        cha.setHitPoints(chaHitPoints);
        System.out.println("请输入角色攻击力（10-99）：");
        int chaAttack = Utility.readInt2();
        cha.setAttack(chaAttack);
        System.out.println("请输入角色防御力（10-99）：");
        int chaDefense = Utility.readInt2();
        cha.setDefense(chaDefense);

        System.out.println("***********************************");
        System.out.println("请输入怪物姓名（不超过五个字）：");
        String monName = Utility.readString(5);
        mon.setName(monName);

        System.out.println("以下是随机生成的怪物数据");
        mon.setHitPoints((int) (Math.random() * 500 + 500));
        System.out.println(mon.getName() + "血量：" + mon.getHitPoints());
        mon.setAttack((int) (Math.random() * 50 + 20));
        System.out.println(mon.getName() + "攻击：" + mon.getAttack());
        mon.setDefense((int) (Math.random() * 20 + 20));
        System.out.println(mon.getName() + "防御：" + mon.getDefense());
        System.out.println("***********************************");





        System.out.println(mon.getName() + "初始血量：" + mon.getHitPoints());
        System.out.println(cha.getName() + "初始血量：" + cha.getHitPoints());


        for (int num = 1; ; num++) {
            System.out.println("回合" + num);
            boolean skillIsChosen = false;//判断是否发动技能
            System.out.println("是否发动技能？（Y/N）：");
            char confirmSelection = Utility.readConfirmSelection();
            if (confirmSelection == 'Y') {
                skillIsChosen = true;
                System.out.println("技能一：该回合攻击对怪物造成的伤害增加100");
                System.out.println("技能二：该回合攻击对怪物造成的伤害增加200%");
                System.out.println("技能三：怪物的防御降低10");


                System.out.println("请选择技能（1/2/3）：");
                char skillSelection = Utility.readSkillSelection();


                switch (skillSelection) {
                    case '1':
                        cha.skill1(mon);
                        System.out.println(mon.getName() + "当前血量：" + mon.getHitPoints());
                        break;

                    case '2':
                        cha.skill2(mon);
                        System.out.println(mon.getName() + "当前血量：" + mon.getHitPoints());
                        break;

                    case '3':
                        cha.skill3(mon);
                        System.out.println(mon.getName() + "当前血量：" + mon.getHitPoints());
                        break;

                }


            }

            if (!skillIsChosen) {
                cha.skill(mon);
                System.out.println(mon.getName() + "当前血量：" + mon.getHitPoints());
            }//如果没有选择技能，就发动普攻
            if (mon.getHitPoints() <= 0) {
                System.out.println("you win");
                return;
            }


            mon.skill(cha);
            System.out.println(cha.getName() + "当前血量：" + cha.getHitPoints());
            System.out.println("***********************************");
            System.out.println();
            if (cha.getHitPoints() <= 0) {
                System.out.println("game over");
                return;
            }
        }


    }
}
