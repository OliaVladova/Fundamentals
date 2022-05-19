package SoftUni.Fundamentals.ExamPreparation;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroesInfo = new TreeMap<>();

        for (int i = 0; i < numHeroes; i++) {
            String[] info = scanner.nextLine().split(" ");
            List<Integer> hitAndMana = new ArrayList<>();
            int hp = Integer.parseInt(info[1]);
            int mp = Integer.parseInt(info[2]);
            hitAndMana.add(hp);
            hitAndMana.add(mp);
            heroesInfo.put(info[0], hitAndMana);
        }
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split(" - ");
            String hero = command[1];
            switch (command[0]) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(command[2]);
                    String spellName = command[3];
                    if (heroesInfo.containsKey(hero)) {
                        if (heroesInfo.get(hero).get(1) >= mpNeeded) {
                            List<Integer> mp = new ArrayList<>();
                            mp.add(heroesInfo.get(hero).get(0));
                            mp.add(heroesInfo.get(hero).get(1)-mpNeeded);
                            heroesInfo.put(hero,mp);
                            System.out.printf("%s has successfully cast %s and now has %d MP!\n",hero,spellName,heroesInfo.get(hero).get(1));
                        }else {
                            System.out.printf("%s does not have enough MP to cast %s!\n",hero,spellName);
                        }
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(command[2]);
                    String attacker = command[3];
                    int hpLeft = heroesInfo.get(hero).get(0) - damage;
                    if (hpLeft>0){
                        List<Integer> hp = new ArrayList<>();
                        hp.add(hpLeft);
                        hp.add(heroesInfo.get(hero).get(1));
                        heroesInfo.put(hero,hp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",hero,damage,attacker,hpLeft);
                    }else {
                        System.out.printf("%s has been killed by %s!\n",hero,attacker);
                        heroesInfo.remove(hero);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(command[2]);
                    int newMP = amount + heroesInfo.get(hero).get(1);
                    if (newMP>200){
                        List<Integer> mp = new ArrayList<>();
                        mp.add(heroesInfo.get(hero).get(0));
                        mp.add(200);
                        heroesInfo.put(hero,mp);
                        amount = amount-(newMP-200);
                    }else {
                        List<Integer> mp = new ArrayList<>();
                        mp.add(heroesInfo.get(hero).get(0));
                        mp.add(newMP);
                        heroesInfo.put(hero,mp);
                    }
                    System.out.printf("%s recharged for %d MP!\n",hero,amount);
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(command[2]);
                    int newHP = amountHeal + heroesInfo.get(hero).get(0);
                    if (newHP>100){
                        List<Integer> hp = new ArrayList<>();

                        hp.add(100);
                        hp.add(heroesInfo.get(hero).get(1));
                        heroesInfo.put(hero,hp);
                        amountHeal = amountHeal-(newHP-100);
                    }else {
                        List<Integer> hp = new ArrayList<>();
                        hp.add(newHP);
                        hp.add(heroesInfo.get(hero).get(1));
                        heroesInfo.put(hero,hp);
                    }
                    System.out.printf("%s healed for %d HP!\n",hero,amountHeal);
                    break;
            }

            input = scanner.nextLine();
        }
        heroesInfo.entrySet().stream().sorted((e1,e2)->e2.getValue().get(0).compareTo(e1.getValue().get(0))).forEach((entry->{
            System.out.printf("%s\n",entry.getKey());
            System.out.printf(" HP: %d\n",entry.getValue().get(0));
            System.out.printf(" MP: %d\n",entry.getValue().get(1));

        }));
    }
}
