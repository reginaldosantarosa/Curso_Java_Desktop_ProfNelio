package model.services;

public class BrasilTaxService {

	public double taxa(double montante) {

		if (montante <= 100.00) {
			return montante * 0.2;
		} else {

			return montante * 0.15;

		}
	}

}
