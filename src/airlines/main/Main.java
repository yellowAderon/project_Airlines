package airlines.main;

import java.util.ArrayList;
import airlines.bean.Airline;
import java.time.LocalTime;
import airlines.logic.Logic;

public class Main {
	public static void main(String[] args) {
		ArrayList<Airline> boikoAirlines = new ArrayList<Airline>();

		Airline airline1 = new Airline("Minsk", "TY 100501", "Mon", LocalTime.of(12, 00), 100);
		Airline airline2 = new Airline("Brest", "TY 100502", "Tue", LocalTime.of(14, 00), 101);
		Airline airline3 = new Airline("NewLife", "TY 100503", "Tue", LocalTime.of(13, 00), 102);
		Airline airline4 = new Airline("Moscow", "TY 100501", "Fri", LocalTime.of(15, 00), 103);
		Airline airline5 = new Airline("Minsk", "TY 100502", "Fri", LocalTime.of(21, 00), 104);
		Airline airline6 = new Airline("Brest", "TY 100503", "Sun", LocalTime.of(22, 10), 105);
		Airline airline7 = new Airline("NewLife", "TY 100501", "Thus", LocalTime.of(15, 00), 106);
		Airline airline8 = new Airline("Moscow", "TY 100502", "Wen", LocalTime.of(20, 00), 107);
		Airline airline9 = new Airline("Minsk", "TY 100501", "Wen", LocalTime.of(11, 00), 108);
		Airline airline10 = new Airline("Brest", "TY 100503", "Fri", LocalTime.of(22, 00), 109);
		Airline airline11 = new Airline("NewLife", "TY 100502", "Fri", LocalTime.of(00, 00), 110);
		Airline airline12 = new Airline("Moscow", "TY 100501", "Mon", LocalTime.of(13, 13), 111);
		Airline airline13 = new Airline("Minsk", "TY 100503", "Mond", LocalTime.of(12, 12), 112);
		Airline airline14 = new Airline("Brest", "TY 100502", "Mon", LocalTime.of(22, 11), 113);
		Airline airline15 = new Airline("NewLife", "TY 100501", "Mon", LocalTime.of(11, 11), 114);

		boikoAirlines.add(airline1);
		boikoAirlines.add(airline15);
		boikoAirlines.add(airline14);
		boikoAirlines.add(airline13);
		boikoAirlines.add(airline12);
		boikoAirlines.add(airline11);
		boikoAirlines.add(airline10);
		boikoAirlines.add(airline9);
		boikoAirlines.add(airline8);
		boikoAirlines.add(airline7);
		boikoAirlines.add(airline6);
		boikoAirlines.add(airline5);
		boikoAirlines.add(airline4);
		boikoAirlines.add(airline3);
		boikoAirlines.add(airline2);

		String destinationTemp = "Brest";
		String dayOfWeekTemp = "Mon";
		LocalTime departureTimeTemp = LocalTime.of(15, 00);
		
		System.out.println("Пункт назначения: <<<" + destinationTemp + ">>> Доступные рейсы:");
		for (Airline s : boikoAirlines) {
			if (s.getDestination() == destinationTemp) {
				System.out.println(s);
				}
		}
		System.out.println();
		System.out.println("Выбранный день недели: <<<" + dayOfWeekTemp + ">>> Доступные рейсы:");
		for (Airline s : boikoAirlines) {
			if (s.getDayOfWeek() == dayOfWeekTemp) {
				System.out.println(s);
			}
		}
		System.out.println();
		System.out.println("Выбранный день недели: <<<" + dayOfWeekTemp + ">>> Выбранное время: <<<" +
		departureTimeTemp + ">>> Доступные рейсы:");
		for (Airline s : boikoAirlines) {
			if (s.getDayOfWeek() == dayOfWeekTemp && departureTimeTemp.isBefore(s.getDepartureTime())) {
				System.out.println(s);
			}
		}
	}
}
