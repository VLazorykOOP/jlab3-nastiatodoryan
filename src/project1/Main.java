package project1; 

class Persona {
    String name;
    int age;

    Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("Iм'я: " + name);
        System.out.println("Вiк: " + age);
    }
}

class Employee extends Persona {
    String position;

    Employee(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Посада: " + position);
    }
}

class Worker extends Employee {
    String workArea;

    Worker(String name, int age, String position, String workArea) {
        super(name, age, position);
        this.workArea = workArea;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Робоча зона: " + workArea);
    }
}

class Engineer extends Employee {
    String specialty;

    Engineer(String name, int age, String position, String specialty) {
        super(name, age, position);
        this.specialty = specialty;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Спецiальнiсть: " + specialty);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona[] people = new Persona[3];

        people[0] = new Employee("Алiса", 30, "Менеджер");
        people[1] = new Worker("Боб", 40, "Майстер", "Будiвництво");
        people[2] = new Engineer("Чарлi", 35, "Провiдний iнженер", "Механiка");

        for (int i = 0; i < people.length; i++) {
            people[i].show();
            System.out.println();
        }
    }
}

