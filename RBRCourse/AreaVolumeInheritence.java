
class Area {
    int length, width;

    protected void setLenght(int length) {
        this.length = length;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    protected int computeArea() {
        return length * width;
    }
}

class Volume extends Area {
    int height;

    protected void setHeight(int height) {
        this.height = height;
    }

    protected int computeVolume() {
        return computeArea() * height;
    }

}

public class AreaVolumeInheritence {
    public static void main(String[] args) {
        Volume obj = new Volume();
        obj.setLenght(2);
        obj.setWidth(3);
        obj.setHeight(6);
        System.out.println("Area = " + obj.computeArea());
        System.out.println("Volume = " + obj.computeVolume());
    }
}
