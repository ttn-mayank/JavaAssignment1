/**
 * 
 */
package Quest4;

import java.util.ArrayList;

/**
 * @author mayank
 *
 */
public class StreamMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		list.stream()
		.filter(i-> i%2==0)
		.forEach(System.out::println);
		
		ArrayList<Employee> list2 = new ArrayList<Employee>(); 
		list2.add(new Employee("Mansi Agarwal",2500l,"delhi"));
		list2.add(new Employee("Richa Jain",5600l,"delhi"));
		list2.add(new Employee("Nancy Srivastava",1500l,"Agra"));
		list2.add(new Employee("Mannu Agarwal",3500l,"delhi"));
		
		list2.stream()
		.filter(i-> i.salary < 5000 && i.city=="delhi")
		.map(i -> i.fullName.split(" ")[0])
		.forEach(System.out::println);
		
	}

}
