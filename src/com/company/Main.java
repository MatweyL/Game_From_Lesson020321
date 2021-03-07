package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String questions[] = new String[] {"Вы любите спорт?", "Вы помните теорему Остроградского-Гаусса?", "Вы любите пиво?", "Вы душа компании?", "Вы жмете 100 кг от груди?"};
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---ИГРА В БОРЦА---");
        System.out.println("Небольшой опрос, чтобы понять, кто вы.\n Ответ да - 1, ответ нет - 0");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(questions[i]);
            if (scanner.nextByte() == 1){
                ans++;
            }
        }
        Sportsmen sportsmen = new Sportsmen(ans);
        Competition championshipBryansk = new Competition();
        championshipBryansk.createEnemies(ans, sportsmen.getStrength(), sportsmen.getHealth(), sportsmen.getEndurance(), sportsmen.getCharisma());
        System.out.println("Впереди тебя ждет 5 схваток с одними из самых опасных ребят-машин Брянска.\nДалее у тебя будет выбор из действий, которые ты сможешь сделать. Если хочешь сделать первый из данных вариантов, пиши 1, если второй, то пиши 2.");
        for (int i = 0; i <5;i++){
            championshipBryansk.fight(sportsmen, i);
        }
        championshipBryansk.printPlace();
        System.out.println("Ура, соревнования закончились, можно домой!...");
        championshipBryansk.statistics(sportsmen);
    }
}
