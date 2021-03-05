package oopsix;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    };

    @Override
    void run(int lenght) {
        if(200<=lenght){
            System.out.println(this.name + " "+ "Коты столько не бегают.");
        }else {
            result(this.name, lenght);
        }
    }

    @Override
    void swim(int lenght) {
        System.out.println(this.name + " "+ "Коты не плавают");
    }
}
