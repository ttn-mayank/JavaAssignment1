/**
 * 
 */
package Quest4;

import java.util.HashMap;

/**
 * @author mayankHashMap
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee,Double> mp = new HashMap<Employee,Double>();
		
		Employee e1 = new Employee("Mayank",21,"Software Engineer",450000);
		Employee e2 = new Employee("Sunny",22,"Project Engineer",550000);
		Employee e3 = new Employee("Ishu",23,"Devops Engineer",650000);
		
		mp.put(e1,e1.salary);
		mp.put(e2,e2.salary);
		mp.put(e3,e3.salary);
		System.out.println(mp.get(e3));
	}

}
