package Exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Color {

    // region Properties
    private String colors;
    // end Properties

    // region Constructors
    public Color() {
    }

    public Color(String colors) {
        this.colors = colors;
    }
    // end Constructors

    // region getter and setter
    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color = (Color) o;
        return Objects.equals(colors, color.colors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colors);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "Color{" +
                "colors='" + colors + '\'' +
                '}';
    }
    // end toString

    // region methods
    public void printCollection(List<String> collection){
            System.out.println(collection);
        }
    // end methods
}
