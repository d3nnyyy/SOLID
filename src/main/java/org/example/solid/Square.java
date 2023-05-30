package org.example.solid;

public class Square implements Shape {

        private final int side;

        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return side;
        }

    @Override
    public double area() {
        return getSide() * getSide();
    }
}
