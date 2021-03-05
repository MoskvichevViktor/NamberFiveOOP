package oopsix;

abstract class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    abstract void run(int lenght);
    abstract void swim(int lenght);
    void result(Object obj, int value){
        System.out.println(this.name  + " пробежал "  + value + " метров");
    }
}
