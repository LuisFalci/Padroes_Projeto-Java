public class Hat implements Cloneable{
    String color;
    String model;
    double size;


    public Hat(String color, String model, double size) {
        super();
        this.color = color;
        this.model = model;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Hat{" +
                "color='" + color +'\'' +
                ", model='" + model +'\'' +
                ", size=" + size +
                '}';
    }
}