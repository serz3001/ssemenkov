package ru.job4j.loop;

public class Pyramid {
    public String paintRight(int height){
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        // внешний цикл двигается по строкам.
        for (int row = 0; row < height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column < height; column++) {
                // если строка равна ячейке, то рисуем галку.
                // в данном случае определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    public String paintLeft(int height) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < height; column++) {
                if (row >= height - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }

    public String paintPyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        System.out.println(pyramid.paintPyramid(4));
    }
}
