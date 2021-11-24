package com.xworkz.busroute;

public class BusRouteDAO {
	
public interface busRouteDAO {
		boolean save(BusRouteDTO BusRouteDTO);

		BusRouteDTO findByName(String name);

		void displayAllBusDetails();

	}

}
