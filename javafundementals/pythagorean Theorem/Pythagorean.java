
public class Pythagorean {
    public static  double calculateHypotenuse(int legA, int legB) {
        double c = Math.pow(legA , 2);
	double w = Math.pow(legB , 2);
	double z = Math.sqrt(c + w);
	return z;

    }
	public static void main(String[] args) {
	System.out.println(calculateHypotenuse(5 , 5));
}

}