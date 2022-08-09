package com.adventure;

public class Hero {
    private String name;
    private int tmp_hp;
    private int max_hp;

    public Hero(String name, int tmp_hp, int max_hp) {
        this.name = name;
        this.tmp_hp = tmp_hp;
        this.max_hp = max_hp;
        System.out.println("勇者" + this.name + "がこの世界に誕生した！");
    }

    public void swingTheSword(LittleGhost littleGhost) {
        System.out.println(this.name + "は、剣を振った！");
        littleGhost.hp -= 10;
        System.out.println("リトルゴーストに、10のダメージを与えた！");
    }

    public void rest(int sec) {
        System.out.println(this.name + "は、" + sec + "秒間休憩した！");
        this.tmp_hp += sec * 2;
        if (this.tmp_hp > this.max_hp) {
            this.tmp_hp = this.max_hp;
        }

        if (this.tmp_hp == this.max_hp) {
            System.out.println("体力が全回復した！");
        } else {
            System.out.println("体力が" + sec * 2 + "回復した！");
        }
    }

    public String getName() {
        return name;
    }

    public int getTmp_hp() {
        return tmp_hp;
    }

    public void setTmp_hp(int tmp_hp) {
        this.tmp_hp = tmp_hp;
    }

    public int getMax_hp() {
        return max_hp;
    }
}
