import java.util.Scanner;
public class square {
    // функция f(x) = x^3 + x + 1
    public static double f(double x) {
        return Math.pow(x, 3) + x + 1;
    }
    // фунуция для вычисления площади
    public static double area(double a, double b, int n) {
        double dx = (b - a) / n; // Ширина каждого подынтервала
        double upper_sum = 0; // Верхняя сумма
        double lower_sum = 0; // Нижняя сумма

        for (int i = 0; i < n; i++) {
            double x_left = a + i * dx; // Левый конец подынтервала
            double x_right = a + (i + 1) * dx; // Правый конец подынтервала
            // Вычисляем значения функции на концах подынтервала
            double f_left = f(x_left);
            double f_right = f(x_right);
            // Обновляем верхнюю и нижнюю суммы
            upper_sum += Math.max(f_left, f_right) * dx;
            lower_sum += Math.min(f_left, f_right) * dx;
        }
        return (upper_sum + lower_sum) / 2; // Среднее значение как приближение площади
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = sc.nextDouble();
        System.out.print("Введите значение b: ");
        double b = sc.nextDouble();
        System.out.print("Введите количество подынтервалов n: ");
        int n = sc.nextInt();
        double area = area(a, b, n);
        System.out.println("Площадь под графиком функции равна: " + area);
        sc.close();
    }
}
