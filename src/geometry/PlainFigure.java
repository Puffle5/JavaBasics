package geometry;
public abstract class PlainFigure implements Figure {
    public final double d1;
    public final double d2;
    public final double d3;
    public PlainFigure(double d1, double d2, double d3) {
        if (d3 > d2 && d3 > d1)
        {this.d3 = d3;
        if (d2 > d1){this.d2 = d2; this.d1 = d1;}
        else {this.d2 = d1; this.d1 = d2;}
        }
        else if (d1 > d2 && d1 > d3)
        {this.d3 = d1;
        if (d2 > d3){this.d2 = d2; this.d1 = d3;}
        else {this.d2 = d3; this.d1 = d2;}
        }
        else if (d2 > d1 && d2 > d3)
        {this.d3 = d2;
        if (d1 > d3) {this.d2 = d1; this.d1 = d3;}
        else {this.d2 = d3; this.d1 = d1;}}
        else {this.d1 = -6;
              this.d2 = -6;
              this.d3 = -6;}

    }
    @Override
    public boolean equals(Figure otherFigure)
    {if (otherFigure == null) {return false;}
    if (otherFigure instanceof PlainFigure)
        {PlainFigure plainFigure = (PlainFigure) otherFigure;
    if (plainFigure.d1 == this.d1 && plainFigure.d2 == this.d2
            && plainFigure.d3 == this.d3) {return true;}
            else {return false;}
    }
    else {return false;}

    }
    @Override
    public void print()
    {System.out.println(d1+" "+d2+" "+d3);}
    public abstract double getArea();
    public abstract double getPerimeter();
}
