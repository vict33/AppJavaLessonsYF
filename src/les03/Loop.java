package les03;

public class Loop {
	String[] abon = new String[20];

	public Loop() {
		abon[0] = "Маша";
		abon[1] = "Лена";
		abon[10] = "Оля";
		abon[11] = "Света";
		abon[19] = "Julia";

		for (int i = 0; i < abon.length; i++) {
			if (abon[i] == null) {
				continue;
			}
			System.out.println("i=" + i + ", " + abon[i]);
		}

		for (String a : abon) {
			if (a == null) {
				continue;
			}
			if (a.matches("(.+)а(.+)?")) {
				System.out.println("fe=" + a);
			}
		}

		int i = 0;
		while (i < abon.length) {
			System.out.println("шаг-" + (i + 1));
			if (abon[i] != null && abon[i].matches(".+я")) {
				System.out.println("wh=" + abon[i]);
				break;
			}
			i++;
		}

	}
}
