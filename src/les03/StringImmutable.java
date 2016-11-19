package les03;

import java.util.Date;

public class StringImmutable {

	public StringImmutable() {
		String s1 = "Masha";
		String s2 = new String("Olya");
		String s3 = new String("Olya");

		if (s1 == "Masha") {
			System.out.println("s1 = Masha");
		} else {
			System.out.println("s1 != Masha");
		}

		if (s2 == s3) {
			System.out.println("s2 = s3; s2.hashCode=" + s2.hashCode() + "; s3.hashCode=" + s3.hashCode());
		} else {
			System.out.println("s2 != s3; s2.hashCode=" + s2.hashCode() + "; s3.hashCode=" + s3.hashCode());
			;
		}

		if (s2.equals(s3)) {
			System.out.println("s2 = s3");
		} else {
			System.out.println("s2 != s3");
		}

		String s = new String("Hello");
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s.hashCode());
		System.out.printf("Address of the reference variable s holding string \"%s\" is %h;%n%n", s, s);

		int[][] tab = new int[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tab[i][j] = (i + 1) * (j + 1);
				// System.out.print(tab[i][j] + "\t");
				System.out.printf("%4d", tab[i][j]);
			}
			System.out.println();
		}

		// format-2
		System.out.printf("%+020.10f%n", Math.PI);

		// format-3
		int i = 675;
		double root;
		root = Math.sqrt(i);
		System.out.printf("Корень числа %d равен %f%n", i, root);
		System.out.printf("Корень числа %2$d равен %1$.3f%n", root, i);

		System.out.printf("%+-4d; %+4d;%n", -15, 22);
		System.out.println(System.currentTimeMillis() + " ## " + new Date());
		System.out.printf("%tF%n", System.currentTimeMillis());
		System.out.printf("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS%n", System.currentTimeMillis());

	}
}
