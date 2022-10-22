package edu.ayarayarovich.task1;

public class Camera {
    private int displayResolution;
    private int sensorResolution;
    private int weight, width, height, depth;

    public Camera(int displayResolution, int sensorResolution, int weight, int width, int height, int depth) {
        this.displayResolution = displayResolution;
        this.sensorResolution = sensorResolution;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(int displayResolution) {
        this.displayResolution = displayResolution;
    }

    public int getSensorResolution() {
        return sensorResolution;
    }

    public void setSensorResolution(int sensorResolution) {
        this.sensorResolution = sensorResolution;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String toString() {
        return getClass().getSimpleName() + ":" + System.lineSeparator() +
                "\tDisplay Resolution: " + getDisplayResolution() + System.lineSeparator() +
                "\tSensor Resolution: " + getSensorResolution() + System.lineSeparator() +
                "\tWeight: " + getWeight() + System.lineSeparator() +
                "\tWidth: " + getWidth() + System.lineSeparator() +
                "\tHeight: " + getHeight() + System.lineSeparator() +
                "\tDepth: " + getDepth();
    }
}
