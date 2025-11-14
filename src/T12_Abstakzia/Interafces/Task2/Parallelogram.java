package T12_Abstakzia.Interafces.Task2;

public abstract class Parallelogram implements Figure {
    private final double a;
    private final double b;

    Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea(){
        return a * b;
    }
}
