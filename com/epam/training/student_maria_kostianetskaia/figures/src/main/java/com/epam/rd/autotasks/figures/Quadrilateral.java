package com.epam.rd.autotasks.figures;

import java.util.Comparator;
import java.util.stream.Stream;

class Quadrilateral extends Figure {
    private final Point A;
    private final Point B;
    private final Point C;
    private final Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    @Override
    public double area() {
        double d1 = new Segment(A, C).length();
        double d2 = new Segment(B, D).length();

        double sinAngle = ((C.getY() - A.getY()) * (D.getX() - B.getX()) -
                (D.getY() - B.getY()) * (C.getX() - A.getX())) / (d1 * d2);

        return 0.5 * sinAngle * d1 * d2;
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
                C.getY() + ")" +
                "(" +
                D.getX() + "," +
                D.getY() + ")"
                ;
    }

    @Override
    public Point leftmostPoint() {
        return Stream.of(A, B, C, D)
                .min(Comparator.comparing(Point::getX))
                .orElse(A);
    }
}
