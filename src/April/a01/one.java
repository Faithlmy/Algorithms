package April.a01;

/*
 * Compute the greatest common divisor of two nonnegative integer p and q  as follows:
 * If q is 0, the answer is p. If not, divide p by q and take the remainder  r. The answer 
 * is greatest common divisor of q and r.
 * 
 * */
public class one {
	public static void main (String []args){
		double pi = Math.PI;
		double sqr = Math.sqrt(3);
		Div d = new Div();
		int a = d.gcd(4, 3);
		System.out.println(a);
		System.out.println(sqr);
		System.out.println(pi);
	}

}
class Div{
	public  int gcd(int p, int q) {
		if (q == 0)
		{
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
}
