package Lab3;

import java.util.Objects;

public abstract class ChessPiece {

    /**
     * The ChessPiece class has an instance variable for value (an int),
     * indicating how 'important' it is, which is set by the constructor parameter.
     * It also has an accessor (getter) and mutator (setter) method for it.
     */
    private int value;

    public ChessPiece(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * This class also has an abstract method called move()
     */
    public abstract void move();

    /**
     * The ChessPiece class overrides the toString() method
     */
    @Override
    public String toString() {
        return "ChessPiece {value = " + value + "}";
    }


    /**
     * The ChessPiece class must override the equals() method
     * (and therefore also the hashCode method) as follows:
     * If two ChessPiece objects have the same value of each other,
     * they are considered equal.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessPiece that = (ChessPiece) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
