public class Cat {

    private String colour;
    private boolean sex;
    private int age;

    public Cat(String colour, boolean sex, int age) {
        this.colour = colour;
        this.sex = sex;
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
