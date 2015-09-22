/**
 * Created by shah on 22.09.2015.
 */
public class RungeKutt {
    public static void main(String[] args) {
        double a = 1, b = 3;
        double x0 = 1, y0_1 = 2, y0_2 = 2, y0_3 = 2, h=0.01,
                x1=0, y1_1=0, y1_2=0, y1_3=0;
        for(double i=0;i<b-1;i+=h){
            x1 = x0+h;
            y1_1 = rungekutt1(h, y0_1, x0);
            y1_2 = rungekutt3(h, x0, y0_2);
            y1_3 = rungekutt4(h, x0, y0_3);
            System.out.printf("%f %f %f %f %f \n",x1,y1_1,y1_2,y1_3,calc(x1));
            x0 = x1;
            y0_1 = y1_1;
            y0_2 = y1_2;
            y0_3 = y1_3;
        }

    }

    public static double rungekutt1(double h, double y0, double x0) {
        return y0 + func(x0, y0) * h;
    }


    public static double rungekutt3(double h, double x0, double y0) {
        double k1 = h * func(x0, y0);
        double k2 = h * func(x0 + (h / 2), y0 + (k1 / 2));
        double k3 = h * func(x0 + h, y0 - k1 + 2 * k2);
        return y0 + ((k1 + 4 * k2 + k3) / 6);
    }

    public static double rungekutt4(double h, double x0, double y0) {
        double k1 = h * func(x0, y0);
        double k2 = h * func(x0 + (h / 2), y0 + (k1 / 2));
        double k3 = h * func(x0 + (h / 2), y0 + (k2 / 2));
        double k4 = h * func(x0 + h, y0 + k3);
        return y0 + ((k1 + 2 * k2 + 2 * k3 + k4) / 6);
    }

    public static double func(double x0, double y0) {

        return 2 * (y0 / x0 + Math.pow(x0, 3));
    }
    public static double calc(double x0){
        return x0*x0+x0*x0*x0*x0;
    }

}