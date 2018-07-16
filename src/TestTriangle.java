public class TestTriangle {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(1, 1, 2);
        Triangle tri2 = new Triangle(1, 2, 5);
        Triangle tri3 = new Triangle(1, 4, 5);
        Triangle tri4 = new Triangle(2, 2, 8);

        CheckTriangle check = new CheckTriangle();

        check.isRightTriangle(tri1);
        check.isRightTriangle(tri2);
        check.isRightTriangle(tri3);
        check.isRightTriangle(tri4);
        System.out.println(check.isRightTriangle(tri1));
        System.out.println(check.isRightTriangle(tri2));
        System.out.println(check.isRightTriangle(tri3));
        System.out.println(check.isRightTriangle(tri4));
    }
}
