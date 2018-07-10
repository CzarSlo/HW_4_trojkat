public class Triangle {
    private int firstFlank;
    private int secondFlank;
    private double thirdFlank;

    public Triangle(int firstFlank, int secondFlank, double thirdFlank) {
        this.firstFlank = firstFlank;
        this.secondFlank = secondFlank;
        this.thirdFlank = thirdFlank;
    }

    public int getFirstFlank() {
        return firstFlank;
    }

    public void setFirstFlank(int firstFlank) {
        this.firstFlank = firstFlank;
    }

    public int getSecondFlank() {
        return secondFlank;
    }

    public void setSecondFlank(int secondFlank) {
        this.secondFlank = secondFlank;
    }

    public double getThirdFlank() {
        return thirdFlank;
    }

    public void setThirdFlank(double thirdFlank) {
        this.thirdFlank = thirdFlank;
    }
}




