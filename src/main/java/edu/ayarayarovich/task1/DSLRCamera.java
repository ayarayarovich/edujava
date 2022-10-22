package edu.ayarayarovich.task1;

public class DSLRCamera extends Camera {
    private String lensMountType;

    public DSLRCamera(int displayResolution,
                      int sensorResolution,
                      int weight,
                      int width,
                      int height,
                      int depth,
                      String lensMountType) {
        super(displayResolution, sensorResolution, weight, width, height, depth);
        this.lensMountType = lensMountType;
    }

    public String toString() {
        return super.toString() + System.lineSeparator() +
                "\tLens Mount Type: " + getLensMountType();
    }

    public String getLensMountType() {
        return lensMountType;
    }

    public void setLensMountType(String lensMountType) {
        this.lensMountType = lensMountType;
    }
}
