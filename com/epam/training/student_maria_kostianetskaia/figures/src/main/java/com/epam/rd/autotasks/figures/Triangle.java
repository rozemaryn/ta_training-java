package com.epam.rd.autotasks.figures;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.lang.Math.sqrt;

class Triangle extends Figure {
    private final Point A;
    private final Point B;
    private final Point C;
    private final double a;
    private final double b;
    private final double c;


    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;

        a = new Segment(B, C).length();
        b = new Segment(A, C).length();
        c = new Segment(A, B).length();
    }

    @Override
    public double area() {
        double p = (a + b + c)/2;
        return sqrt(p * (p - a)*(p - b)*(p - c));
    }

    @Override
    public String pointsToString() {
        return "(" +
                A.getX() + "," +
                A.getY() + ")" +
                "(" +
                B.getX() + "," +
                B.getY() + ")" +
                "(" +
                C.getX() + "," +
                C.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        return Stream.of(A, B, C)
                .min(Comparator.comparing(Point::getX))
                .orElse(A);
    }
}
