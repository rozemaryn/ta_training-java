package com.epam.rd.autotasks.triangle;

import static java.lang.Math.sqrt;

class Triangle {

    private final Point A;
    private final Point B;
    private final Point C;
    private double ab;
    private double bc;
    private double ac;


    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;

        isDegenerate(A, B, C);
    }

    public void isDegenerate (Point A, Point B, Point C) {
        ab = new Segment(A, B).length();
        bc = new Segment(B, C).length();
        ac = new Segment(A, C).length();


        if (!(bc < ac + ab && ac < ab + bc && ab < bc + ac)) {
            throw new IllegalArgumentException("Triangle is degenerate");
        }
    }

    public double area() {
        double p = (bc + ac + ab)/2;
        return sqrt(p * (p - bc)*(p - ac)*(p - ab));
    }

    public Point centroid(){
        double x = (this.A.getX() + this.B.getX() + this.C.getX()) / 3;
        double y = (this.A.getY() + this.B.getY() + this.C.getY()) / 3;

        return new Point(x, y);
    }

}
