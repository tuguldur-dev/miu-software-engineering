package org.miu.lab.lab9.MortgageProject.src;

import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {
	
	public double computeMaxMortgage(int birthYear, int month, int day, double monthlyIncome, boolean married, double monthlyIncomePartner, Profession profession) {
		double totalMortgage=0;
		//calculate age
		LocalDate today = LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(birthYear, month, day);  //Birth date
		 
		Period p = Period.between(birthday, today);
		int age = p.getYears();
		System.out.println(age);

		if (age < 18) {
			return totalMortgage;
		}

		double income = married
				? monthlyIncome + monthlyIncomePartner * 0.94
				: monthlyIncome;


		return getMortgage(income, profession);
	}

	private double getMortgage(double income, Profession profession) {
		if (income < 2000) {
			return 0;
		}

		if (income < 3000) {
            return switch (profession) {
                case DEVELOPER, ARCHITECT, SCRUM_MASTER -> 160000;
                case TESTER, SYSTEM_ADMINISTRATOR, TECHNICAL_WRITER -> 120000;
                case DEPARTMENT_HEAD, PROFESSOR -> 220000;
            };
		}

		if (income < 5000) {
            return switch (profession) {
                case DEVELOPER, ARCHITECT, SCRUM_MASTER -> 180000;
                case TESTER, SYSTEM_ADMINISTRATOR, TECHNICAL_WRITER -> 140000;
                case DEPARTMENT_HEAD, PROFESSOR -> 250000;
            };
		}

        return switch (profession) {
            case DEVELOPER, ARCHITECT, SCRUM_MASTER -> 220000;
            case TESTER, SYSTEM_ADMINISTRATOR, TECHNICAL_WRITER -> 160000;
            case DEPARTMENT_HEAD, PROFESSOR -> 280000;
        };

    }

}
