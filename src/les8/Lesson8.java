package les8;

import java.util.ArrayList;
import java.util.Date;

public class Lesson8 {

	public static void main(String[] args) {
		System.out.println("Lesson8, " + new Date());

		ArrayList a = new ArrayList();
		Customer cust1 = new Customer("Sam", "Smith");
		Customer cust2 = new Customer("Jhon", "Black");
		Order ord1 = new Order("coffee");

		a.add(cust1);
		a.add(cust2);
		a.add(ord1);
		Customer cust3 = (Customer) a.get(0);

		System.out.println("cust3=" + cust3.getFirsName() + " " + cust3.getLastName());
		System.out.println("Размер массива a=" + a.size());

		// на 3-м элементе выпадет ClassCastException
		// for (int i = 0; i < a.size(); i++) {
		// Customer c = (Customer) a.get(i);
		// System.out.println("The current Customer is " + c.getFirsName() + " " + c.getLastName());
		// }

		//
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) instanceof Customer) {
				Customer c = (Customer) a.get(i);
				System.out.println("The current Customer is " + c.getFirsName() + " " + c.getLastName());
			} else if (a.get(i) instanceof Order) {
				Order o = (Order) a.get(i);
				System.out.println("The Order is " + o.getOrderName());
			}
		}

	}

}
