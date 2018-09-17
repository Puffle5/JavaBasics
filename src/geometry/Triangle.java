package geometry;
public class Triangle extends PlainFigure
{public Triangle(double d1, double d2, double d3) throws TriangleException
{super(d1, d2, d3);
if (this.d1 < 0 || this.d2 < 0 || this.d3 < 0)
{throw new TriangleException("Negative side!");}
if (this.d1 + this.d2 <= this.d3
        && this.d2 + this.d3 <= this.d1
        && this.d1 + this.d3 <= this.d2)
{throw new TriangleException("No such triangle!");}}
@Override
public double getArea()
{double p = this.getPerimeter()/2;
double S = Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
return S;}
@Override
public double getPerimeter()
{double P = d1 + d2 + d3; return P;}
public static boolean checkTriangles(Triangle firstTriangle, Triangle secondTriangle)
{double firstRatio = firstTriangle.d1/secondTriangle.d1,
        secondRatio = firstTriangle.d2/secondTriangle.d2,
        thirdRatio = firstTriangle.d3/secondTriangle.d3;
    if (firstRatio == secondRatio && firstRatio == thirdRatio)
       {return true;} else {return false;}
}}
