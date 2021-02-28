package oopfive;

public class Employee {
    //employee - сотрудник
    private String full_name; //
    private String post; //должность
    private String email;
    private String phone_number; //
    private int salary; //зарплата
    private int age; //

    Employee(String full_name, String post, String email, String phone_number,
                                   int salary, int age){
        this.full_name = full_name;
        this.post = post;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;

    }
    void print_all_about_employee(){
        System.out.println("ФИО: " + this.full_name +"\t"+ "Должность: " + this.post +  "\t" +
                "Эл. почта: " + this.email + "\t" + "Телефон: " + this.phone_number + "\t" +
                "Оклад: " + this.salary + "\t" +"Возраст: " + this.age);
    }
    String print_all_about_employee_for40(){
        return ("ФИО: " + this.full_name +"\t"+ "Должность: " + this.post +  "\t" +
                "Эл. почта: " + this.email + "\t" + "Телефон: " + this.phone_number + "\t" +
                  "Оклад: " + this.salary + "\t" +"Возраст: " + this.age);
    }
    int for_if_age(){
        return age;
    }

}
