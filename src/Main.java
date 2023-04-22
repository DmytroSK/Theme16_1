public class Main {
    public static void main(String[] args) {

        Box box = new Box(10,10,10);
        Box box1 = new Box(box);
        Box box2 = new Box(box,box1,2);

        Box box3 = box.plusBoxes(box1);

        box.showVolume();
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();

    }
}