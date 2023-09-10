package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int biggestSide;
    private int smallestSide;

    public IsoscelesTrapezoid(){
    }
    public IsoscelesTrapezoid(int biggestSide, int smallestSide, int leg,String color) {
        this.biggestSide = biggestSide;
        this.smallestSide = smallestSide;
        this.leg =leg;
        setColor(color);
        setArea(obtainArea());
    }

    @Override
    public double obtainArea() {
        return ((leg ^ 2 - (biggestSide - smallestSide) / 2) ^ 2) * (biggestSide + smallestSide) / 2;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + getArea() + " sq.units, biggestSide: " +  biggestSide + " units, smallestSide: " + smallestSide + " units, leg: " + leg + " units, color: " + getColor());
    }
}
