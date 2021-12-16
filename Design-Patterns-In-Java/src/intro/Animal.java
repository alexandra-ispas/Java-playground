package intro;

import java.util.Objects;

public class Animal {
    private String type;
    private String name;
    private int age;

    public String makeSound() {
        return "default sound";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Animal animal) {
            return age == animal.age && Objects.equals ( type, animal.type ) &&
                    Objects.equals ( name, animal.name );
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash ( type, name, age );
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
