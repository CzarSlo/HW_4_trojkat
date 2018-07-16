import static java.lang.StrictMath.sqrt;

public class CheckTriangle {

    public boolean isRightTriangle(Triangle triangle) {
        double liczba1 = triangle.getFirstFlank();
        double liczba2 = triangle.getSecondFlank();
        int n = 2;
        double potęga1 = Math.pow(liczba1, n);
        double potęga2 = Math.pow(liczba1, n);

        double a = sqrt(potęga1 + potęga2);
        double b = sqrt(triangle.getThirdFlank());
        return a == b;
    }
}
