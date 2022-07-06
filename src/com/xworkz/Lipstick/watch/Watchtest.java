package com.xworkz.Lipstick.watch;

public class Watchtest {

	public static void main(String[] args) {
		Watch w0 = new Watch("fastrack", 7000, "black");
		Watch w1 = new Watch("sonata", 5000, "white");
		Watch w2 = new Watch("titan", 3000, "gray");
		Watch w3 = new Watch("rado", 2000, "blue");
		Watch w4 = new Watch("timex", 6000, "orange");
		Watch[] watches = { w0, w1, w2, w3, w4 };
		for (int i = 0; i < watches.length; i++) {
			if (watches[i].price <= 7000) {
				System.out.println(watches[i] + "these are analog");
			} else {
				System.out.println(watches[i] + "these are digital");

			}

		}

	}

}