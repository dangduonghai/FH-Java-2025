/****************************************************************
The diameter of the Sun is approximately 865,000 miles. The diameter of the Earth is 
approximately 7600 miles. Use the methods in the class Math to calculate, 
(a) the volume of the Earth in cubic miles 
(b) the volume of the Sun in cubic miles 
(c) the ratio of the volume of the Sun to the volume of the Earth 
and then output the three values. Treat both the earth and sun as spheres. The volume of a 
sphere is given by the formula 4 pi r^3/3 where r is the radius. 
Run the code you have written, and turn in both your code and the output of the program. The 
output should say something like: The volume of the Earth is X cubic miles, the volume of the 
sun is Y cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is Z. 
****************************************************************/
public class Problem_1 {

    public static void main(String[] args) {

        double diameterSun = 865000;
        double diameterEarth = 7600;

        double radiusEarth = diameterEarth / 2.0;
        double radiusSun = diameterSun / 2.0;

        double volumeEarth = (4.0 / 3.0) * Math.PI * Math.pow(radiusEarth, 3);
        double volumeSun = (4.0 / 3.0) * Math.PI * Math.pow(radiusSun, 3);

        double ratio = volumeSun / volumeEarth;

        System.out.println("\nThe volume of the Earth in cubic miles:  " + volumeEarth + " cubic miles.");
        System.out.println("\nThe volume of the Sun in cubic miles:  " + volumeSun + " cubic miles.");
        System.out.println("\nThe ratio of the volume of the Sun to the volume of the Earth: " + ratio + ".");
    }
}
