package ru.job4j;

import java.math.*;
import java.io.*;
/**
 * @author Sergey Semenkov
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("Расстояние между точками А и В : " + a.distanceTo(b));
    }
}