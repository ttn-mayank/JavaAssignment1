/**
 * 
 */
package Quest1;

/**
 * @author mayank
 *
 */
public class LambdaExpression {

	/**
	 * @param args
	 */
	
	public static int increment(int a) {
		return ++a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GreaterNumberlambda gn = (a,b)->{
			return a>b?true:false;
		};
		
		System.out.println(gn.greaterNumber(5, 1));
		
		IncrementLambda incrementLambda = LambdaExpression::increment;
		System.out.println(incrementLambda.increment(1));
		
		ConcatLambda cl = (a,b)->{
			StringBuilder str = new StringBuilder();
			str.append(a);
			str.append(b);
			return str.toString();
		};
		
		System.out.println(cl.concat("Mayank","Kumar"));
		
		UpperCaseLambda ul = (a)->{
			return a.toUpperCase();
		};
		
		System.out.println(ul.Upper("Mayank"));
		
	} 

}
