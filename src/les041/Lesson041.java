package les041;

import java.util.Date;

public class Lesson041 {

	public static void main(String[] args) {
		System.out.println("Lesson041, " + new Date());

		// Вариант-1. Реализация через interface
		// Создаем массив объектов super-класса Person и помещаем туда разные sub-классы
		// Определяем зкземпляр sub-класса и работаем с ним через downcasting
		System.out.println("Вариант-1. Реализация через interface");
		Person[] workers1 = new Person[3];
		workers1[0] = new Employee("Петя");
		workers1[1] = new Contractor("Вася");
		workers1[2] = new Employee("Маша");

		Employee currentEmployee;
		Contractor currentContractor;

		for (Person p : workers1) {
			if (p instanceof Employee) {
				currentEmployee = (Employee) p;
				currentEmployee.increasePay(30);
			} else if (p instanceof Contractor) {
				currentContractor = (Contractor) p;
				currentContractor.increasePay(30);
			}
		}

		// Вариант-2. Реализация через interface
		// Создаем массив объектов интерфейса Payable.
		// Работаем только с методами этого интерфейса.
		System.out.println("Вариант-2. Реализация через interface");
		Payable[] workers2 = new Payable[3];
		workers2[0] = new Employee("Петя");
		workers2[1] = new Contractor("Вася");
		workers2[2] = new Employee("Маша");

		for (Payable p : workers2) {
			p.increasePay(30);
		}

		// Вариант-3. Error downcasting
		// Создаем массив объектов super-класса Person и помещаем туда разные sub-классы
		// Экземпляр sub-класса не определяем и сразу делаем downcasting
		System.out.println("Вариант-3. Error downcasting");
		Person[] workers3 = new Person[3];
		workers3[0] = new Employee("Петя");
		workers3[1] = new Contractor("Вася");
		workers3[2] = new Employee("Маша");

		for (Object o : workers3) {
			try {
				((Employee) o).increasePay(30);
			} catch (ClassCastException e) {
				System.out.println("Error ClassCastException for " + o.getClass());
			}
		}

	}
}
