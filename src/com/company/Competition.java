package com.company;


import java.util.Random;
import java.util.Scanner;

public class Competition {
    private int defeat = 0, win = 0;
    private Enemy enemies[] = new Enemy[5];
    private String questions1[] = new String[]{"Зайти на бедро?", "Сделать проход в ноги?", "Сделать прогиб!", "Рубануть подхват", "Подсечь под две ноги?"};
    private String questions2[] = new String[]{"Показать движение вперед и сделать заднюю подножку?", "Поднять на мельницу?", "Выполнить комбинацию: зацеп -> подхват?", "Сделать ножницы?", "Сделать бычка?"};
    private String fightGood[] = new String[]{"Отлично, технично, эпично! Твоя победа поистине красива", "Не зря тренировался, победа!", "Машина, руби так дальше!"};
    private String fightBad[] = new String[]{"Тебе не хватило силы это сделать, тебя контратаковали и запустили в космос...", "Ты споткнулся при заходе и тебя положили на лопатки чистым броском"};
    private StringBuffer userWord = new StringBuffer();
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    private void showStatistics(Sportsmen sportsmen){
        System.out.printf("%14s", '|');
        for (int i = 0; i < 5; i++){
            System.out.printf("%14s", "Соперник " + (i + 1) + '|');
        }
        System.out.printf("%14s", "Вы" + '|');
        System.out.println();
        System.out.printf("%14s", "Здоровье" + '|');
        for (int i = 0; i < 5; i++){
            System.out.printf("%14s", enemies[i].getHealth());
            System.out.print('|');
        }
        System.out.printf("%14s", sportsmen.getHealth());
        System.out.println('|');
        System.out.printf("%14s", "Сила" + '|');
        for (int i = 0; i < 5; i++){
            System.out.printf("%14s", enemies[i].getStrength());
            System.out.print('|');
        }
        System.out.printf("%14s", sportsmen.getStrength());
        System.out.println('|');
        System.out.printf("%14s", "Выносливость" + '|');
        for (int i = 0; i < 5; i++){
            System.out.printf("%14s", enemies[i].getEndurance());
            System.out.print('|');
        }
        System.out.printf("%14s", sportsmen.getEndurance());
        System.out.println('|');
        System.out.printf("%14s", "Харизма" + '|');
        for (int i = 0; i < 5; i++){
            System.out.printf("%14s", enemies[i].getCharisma());
            System.out.print('|');
        }
        System.out.printf("%14s", sportsmen.getCharisma());
        System.out.println('|');
    }

    public void statistics(Sportsmen sportsmen){
        System.out.println("Хотите ли вы посмотреть на характеристики своих соперников?(1/0)");
        byte ans = scanner.nextByte();
        if (ans == 1){
            showStatistics(sportsmen);
        }
    }

    public void printPlace(){
        if (defeat >= 3){
            System.out.println("Ты проиграл " + defeat + " схваток...");
            System.out.println("Дружище, ты пытался, но нужно больше тренировать и меньше пить пиво)");

        }
        else{
            System.out.println("Красавчик! Ты выиграл " + win + " схваток!");
        }
    }

    public void createEnemies(int karma, int sStrength, int sHealth, int sEndurance, int sCharisma)
    {
        for (int i = 0; i < 5; i++)
        {
            enemies[i] = new Enemy(sStrength +(random.nextInt(3) - karma), sEndurance + (random.nextInt(3) - karma), sHealth + (karma - random.nextInt(5)), sCharisma - (int)Math.pow(-1, random.nextInt(1)));
        }
    }
    public void fight(Sportsmen sportsmen, int i)
    {
        System.out.println("___Началась схватка!___");
        System.out.println(questions1[random.nextInt(questions1.length - 1)]);
        System.out.println("или");
        System.out.println(questions2[random.nextInt(questions1.length - 1)]);
        userWord.append(scanner.next());
        userWord.delete(0, userWord.length());
        boolean a[] = new boolean[4];
        a[0] = sportsmen.getCharisma() >enemies[i].getCharisma();
        a[1] = sportsmen.getHealth() > enemies[i].getHealth();
        a[2] = sportsmen.getEndurance() > enemies[i].getEndurance();
        a[3] = sportsmen.getStrength() > enemies[i].getStrength();
        if (a[random.nextInt(3)] && a[random.nextInt(3)])
        {
            System.out.println(fightGood[random.nextInt(fightGood.length - 1)]);
            win++;
        }
        else
        {
            System.out.println(fightBad[random.nextInt(fightBad.length - 1)]);
            defeat++;
        }
        System.out.println("___Схватка окончена___");

    }


}
