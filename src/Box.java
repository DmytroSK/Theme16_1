public class Box {

    private int width;
    private int length;
    private int height;

    public Box() {
    }

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Box (Box box){
        this.width = box.width;
        this.length = box.length;
        this.height = box.height;
    }

    public Box (Box box, Box box1,int i){
        this.width = box.width + box1.width + i;
        this.length = box.length + box1.length + i;
        this.height = box.height + box1.height + i;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Box plusBoxes (Box box){
        return new Box (width + box.width, length + box.length, height + box.height);
    }

    int volume(){
        return width + length + height;
    }
    void showVolume (){
        System.out.println(volume());
    }

    void showHi(){
        System.out.println("Hi");
    }

}