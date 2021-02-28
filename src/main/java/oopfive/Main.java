package oopfive;

public class Main {
    public static void main(String[] args){
        Employee secretary  = new Employee("Секретарёва", "секретарь", "s@mail.ru",
                "5-13-13", 25000, 35);
        Employee guard  = new Employee("Охранников", "охранник", "o@mail.ru",
                "6-13-13", 20000, 62);//охранник
        Employee engineer  = new Employee("Инженеровский", "инженер","e@mail.ru",
                "7-13-13", 80000, 45);
        Employee director  = new Employee("Начальников", "директор", "d@mail.ru",
                "8-13-13", 120000, 52);
        Employee courier  = new Employee("Курьеров", "курьер","c@mail.ru",
                "9-13-13", 20000, 18);

        System.out.println("Список работников:");
        secretary.print_all_about_employee();
        guard.print_all_about_employee();
        engineer.print_all_about_employee();
        director.print_all_about_employee();
        courier.print_all_about_employee();

        Employee[] mas  = new Employee[5];
        mas[0] = new Employee("Секретарёва", "секретарь", "s@mail.ru",
                "5-13-13", 25000, 35);
        mas[1] = new Employee("Охранников", "охранник", "o@mail.ru",
                "6-13-13", 20000, 62);
        mas[2] = new Employee("Инженеровский", "инженер","e@mail.ru",
                "7-13-13", 80000, 45);
        mas[3] = new Employee("Начальников", "директор", "d@mail.ru",
                "8-13-13", 120000, 52);
        mas[4] = new Employee("Курьеров", "курьер","c@mail.ru",
                "9-13-13", 20000, 18);

        System.out.println("Список работников с возрастом за 40:");
        for (Employee eployee : mas) {
            if (eployee.for_if_age() > 40) {
                System.out.println(eployee.print_all_about_employee_for40());
            }
        }
    }
}
