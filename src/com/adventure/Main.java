package com.adventure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hero heroTaro = new Hero("タロウ", 80, 100);
        Hero heroHanako = new Hero("ハナコ", 100, 150);
        Hero heroJiro = new Hero("ジロウ", 120, 180);
        LittleGhost littleGhost1 = new LittleGhost();


        List<Hero> heroList = new ArrayList<>();
        heroList.add(heroTaro);
        heroList.add(heroHanako);
        heroList.add(heroJiro);

        heroList.forEach(hero ->
                System.out.println("勇者の名前：" + hero.getName() + "、"
                        + "現在のHP：" + hero.getTmp_hp() + "、"
                        + "最大HP：" + hero.getMax_hp()));

        heroList.forEach(hero -> {
            hero.swingTheSword(littleGhost1);
            littleGhost1.attack(hero);
            hero.rest(5);
        });

        heroList.forEach(hero ->
                System.out.println("勇者の名前：" + hero.getName() + "、"
                        + "現在のHP：" + hero.getTmp_hp()));


        for (Hero hero : heroList) {
            System.out.println("誕生した勇者は" + hero.getName() + "です。");
        }

        for (int i = 1; i < 11; i++) {
            System.out.println("勇者は" + i + "回剣を振った！");
        }
    }
}
