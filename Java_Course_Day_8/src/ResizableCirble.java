public class ResizableCirble extends Circle implements Resizable{

    public ResizableCirble(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *=percent/100;
    }

    @Override
    public String toString() {
        return "ResizableCirble{" +
                "radius=" + radius +
                '}';
    }
}
