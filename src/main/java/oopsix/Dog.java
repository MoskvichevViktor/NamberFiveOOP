package oopsix;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    };

    @Override
    void run(int lenght) {
        if(500<=lenght){
            System.out.println(this.name + " "+ "Собаки столько не бегают.");
        }else {
            result(this.name, lenght);
        }
    }

    @Override
    void swim(int lenght) {
        if(10<=lenght){
            System.out.println(this.name + " "+ "Собаки столько не плавают.");
        }else {
            result(this.name, lenght);
        }
    }
}
