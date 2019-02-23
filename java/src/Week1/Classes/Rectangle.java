package Week1.Classes;

public class Rectangle {
    private int width= 1;
    private int height =1 ;
    private String colour = "Blue";


    // constructor
    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        setColour("Blue");
    }

    public Rectangle(int width, int height, String colour) {
        setWidth(width);
        setHeight(height);
        setColour(colour);
    }


    // getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }


    // setter
    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.width = 1;
        }
    }

    public void setColour(String colour) {
        if ((colour.length() > 2) && (colour.length() < 20)) {
            this.colour = colour.toUpperCase();
        }
    }


    // Method
    public void draw() {
        String paintColor = this.colour.substring(0, 1);
        for (int row = 0; row  < this.width; row++) {
            for (int col =0; col < this.height; col++) {
                System.out.print(paintColor + " ");
            }
            System.out.println();
        }

    }

}
