import static java.lang.StrictMath.sqrt;

public class CheckTriangle {

    public boolean isRightTriangle(Triangle triangle) {
        double a = sqrt(triangle.getFirstFlank()^2 + triangle.getSecondFlank()^2);
        double b = sqrt(triangle.getThirdFlank());
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}