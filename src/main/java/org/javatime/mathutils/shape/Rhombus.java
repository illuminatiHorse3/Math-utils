package org.javatime.mathutils.shape;

public class Rhombus implements Shape{

    private double sideLength;
    private double angleA;
    private double angleB;
    private double altitude;
    private double diagonalA;
    private double diagonalB;


    // Calculates 2nd angle of right triangle given one other angle
    public static double calculateAngleB(double angle){
        double angle_two = 90 - angle;
        return (angle == 0) ? 0: angle_two;
    }

    // Calculates a side of triangle, given hypotenuse and angle values
    public static double calculateRightTriangleSideB(double hypotenuse, double angleA){
        return hypotenuse * Math.sin(angleA);
    }

    private double inferAngleB(){
        return calculateAngleB((angleA/2));
    }
    private double inferDiagonalA(){
        return calculateRightTriangleSideB(sideLength, angleA) * 2;
    }
    private double inferDiagonalB(){
        return Math.sqrt(Math.pow(sideLength, 2) - Math.pow((diagonalA/2), 2));
    }

    public Rhombus(double sideLength, double angleA){
        this.sideLength = sideLength;
        this.angleA = angleA;

        this.angleB = inferAngleB();
        this.diagonalA = inferDiagonalA();
        this.diagonalB = inferDiagonalB();
    }

    public Rhombus(double sideLength, double angleA, double altitude){
        if(angleA == 0){

        }
    }


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public int sideCount() {
        return 0;
    }

    public static class Builder{
        private double sideLength = 0;
        private double angleA = 0;
        private double angleB = 0;
        private double altitude = 0;
        private double diagonalA = 0;
        private double diagonalB = 0;

        public Builder setSideLength(double sideLength){
            this.sideLength = sideLength;
            return this;
        }

        public Builder setAltitude(double Altitude){
            this.altitude = Altitude;
            return this;
        }
        public Builder setAngleA(double angleA){
            this.angleA = angleA;
            return this;
        }
        public Builder setAngleB(double angleB){
            this.angleB = angleB;
            return this;
        }
        public Builder setDiagonalA(double diagonalA){
            this.diagonalA = diagonalA;
            return this;
        }
        public Builder setDiagonalB(double diagonalB){
            this.diagonalB = diagonalB;
            return this;
        }

        public

    }
}
