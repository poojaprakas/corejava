package com.xworkz.busroute;
 import com.xworkz.amazon.dto.AirportDTO;
 import com.xworkz.amazon.dao.AirPortDAO;

public class ArrayAirPortDAO implements AirPortDAO {
	private AirportDTO [] dtos = new AirportDTO[100];;
	private int counter;

	@Override
	public boolean save( AirportDTO airportDTO) {
		System.out.println("invoked save");
		return true;
	}

	@Override
	public AirPortDAO findbyname(String name) {
		System.out.println("invoked name");
		return null;
	}

	@Override
	public void display() {
		System.out.println("invoked display method");
		
	}
	public void saveAirPort(AirPortDTO airPortRouteDTO, int i) {
		System.out.println("save busRouteDTO dto and int cost:".concat(null));
		if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
			this.dtos[this.counter++] = airportRouteDTO;
			System.out.println("save airportRouteDTO dto and int cost:".concat(String.valueOf(i)));
		} else {
			System.out.println("Cannot save the airportRouteDTO :".concat(String.valueOf(this.counter)));
		}
	}

	public void saveBusRoute(BusRouteDTO busRouteDTOs1) {
		System.out.println("invoked saveCart ");

		if (this.counter < this.dtos.length && this.counter >= 0) {
			this.dtos[this.counter++] = busRouteDTOs1;

		} else {
			System.out.println("Cannot saveBusRoute the dtos :".concat(String.valueOf(this.counter)));
		}
	}

	

}
