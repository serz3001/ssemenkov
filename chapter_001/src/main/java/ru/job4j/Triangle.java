package ru.job4j;

import java.math.*;
import java.io.*;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     *
     * @param ab Расстояние от точки a до точки b.
     * @param ac Расстояние от точки a до точки c.
     * @param bc Расстояние от точки b до точки c.
     * @return Периметр треугольника.
     */
    public double perimeter(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник существует или -1, если треугольник не существует.
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.perimeter(ab, ac, bc);
        // написать формулу для расчета площади треугольника.
        if (this.exist(ab, ac, bc))
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @param ab Расстояние от точки a до точки b.
     * @param ac Расстояние от точки a до точки c.
     * @param bc Расстояние от точки b до точки c.
     * @return true если трегольник существует, false если трегольник не существует.
     */
    private boolean exist(double ab, double ac, double bc) {
        if ((ab + ac) > bc)
            return true;
        else if ((ac + bc) > ab)
            return true;
        else if ((ab + bc) > ac)
            return true;
        else
            return false;
    }
}
