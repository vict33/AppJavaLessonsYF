package les042;

import java.util.Date;

public class Lesson042 {

	public static void main(String[] args) {
		System.out.println("Lesson042, " + new Date());

		// Вариант-1. Реализация через abstract class
		// Создаем массив объектов super-класса Person и помещаем туда разные sub-классы
		// Работаем с абстрактными (и другими) методами super-класса Person
		System.out.println("Вариант-1. Реализация через abstract class");
		Person[] workers = new Person[3];
		workers[0] = new Employee("Петя");
		workers[1] = new Contractor("Вася");
		workers[2] = new Employee("Маша");

		for (Person p : workers) {
			p.increasePay(30);
		}

	}

}
