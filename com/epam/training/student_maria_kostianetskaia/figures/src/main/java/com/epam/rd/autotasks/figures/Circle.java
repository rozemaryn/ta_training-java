package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private final Point center;
    private final double radius;

    Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius * Math.PI;
    }

    @Override
    public String pointsToString() {
        return "(" +
                center.getX() + "," +
                center.getY() + ")";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX() - radius, center.getY());
    }

    @Override
    public String toString() {
        return "Circle[" + "(" +
                center.getX() + "," +
                center.getY() +
                ")" + radius +
                "]";
    }
}
