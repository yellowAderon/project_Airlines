package airlines.bean;


import java.time.LocalTime;
import java.util.Date;

public class Airline {
	public String destination;
	public String dayOfWeek;
	private LocalTime departureTime;
	private String aircraftType;
	private int aircraftNumber;
	

	public Airline() {
		destination = "null";
		dayOfWeek = "Mon";
		aircraftType = "null";
		aircraftNumber = 0;
		departureTime = null;
	}

	public Airline(String _destination, String _aircraftType, String _dayOfWeek, LocalTime _departureTime,
			int _aircraftNumber) {
		destination = _destination;
		dayOfWeek = _dayOfWeek;
		departureTime = _departureTime;
		aircraftType = _aircraftType;
		aircraftNumber = _aircraftNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getAircraftNumber() {
		return aircraftNumber;
	}

	public void setAircraftNumber(int aircraftNumber) {
		this.aircraftNumber = aircraftNumber;
	}

	@Override
	public String toString() {
		return "[Пункт назначения:" + destination + ", День недели:" + dayOfWeek + ", Время вылета: " + departureTime
				+ ", Тип самолета: " + aircraftType + ", Номер рейса: " + aircraftNumber + "]";
	}

	
}
