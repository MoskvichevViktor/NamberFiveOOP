package oopsix;
/*1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом
выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
собака 10 м.).
*/

public class MainSix {
    public static void main(String[] args){
        Cat Tom = new Cat("Tom");
        Tom.run(150);
        Tom.swim(150);

        Cat Tim = new Cat("Tim");
        Tim.run(350);

        Dog Belka = new Dog("Belka");
        Belka.run(550);
        Belka.swim(5);

        Dog Strelka = new Dog("Strelka");
        Strelka.run(250);
        Strelka.swim(50);

    }
}
