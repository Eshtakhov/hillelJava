/**
 * Created by shah on 25.09.2015.
 */
public class RungeKuttII{
    double a=0,b=0;

    public static void main(String[] args) {
        double a=0,b=2;
        double x0 = 0, y0_1 = 0.3, y0_sht = 0.1,
                x1, y1_1 = 0, y1_sht = 0,h=0.01;
        System.out.println(" x  RungeKuttIV     absolut");
        for (double i = a; i < b; i += h)
        {
            x1 = x0 + h;
            y1_1 = rungekuttIV(h , x0, y0_1, y0_sht, y1_1, y1_sht);
            System.out.printf("%f\t%f\t%f \n", x1, y1_1, analitichecki(x1));
            x0 = x1;
            y0_1 = y1_1;
            y0_sht = y1_sht;
        }
    }

    private static double analitichecki(double x) {
        return 0.1*Math.sin(x)+0.3*Math.cos(x);
    }

    public static double rungekuttIV(double h, double x0, double y0, double y0_sht,  double y1, double y1_sht)
    {
        double k1 = h * func(x0, y0, y0_sht);

        double k2 = h * func(x0 + (0.5 * h), y0 + ((0.5 * h) * y0_sht) + ((0.125 * h) * k1), y0_sht + (0.5 * k1));

        double k3 = h * func(x0 + (0.5 * h), y0 + (0.5 * h) * y0_sht + ((0.125 * h) * k2), y0_sht + (0.5 * k2));

        double k4 =h* func(x0 + h, y0 + (h * y0_sht) + (0.5 * h) * k3, y0_sht + k3);

        y1_sht = y0_sht + ((k1 + 2 * k2 + 2 * k3 + k4) / 6);
        y1 = y0 + h * (y0_sht + ((k1 + k2 + k3) / 6));
        return y1;
    }

    private static double func(double x0, double yo, double yo_sht) {
        return Math.sin(x0)+3*yo_sht+2*yo;
    }


}
