package com.xworkz.busroute;

import com.xworkz.busroute.BusRouteDAO;
import com.xworkz.busroute.BusRouteDAO.busRouteDAO;
import com.xworkz.busroute.BusRouteDTO;

	public class ArrayBusRouteDAO implements busRouteDAO {

		private BusRouteDTO[] dtos = new BusRouteDTO[100];;
		private int counter;

		public boolean save(BusRouteDTO busRouteDTO) {
			System.out.println("invoked save");
			return true;
		}

		public BusRouteDTO findByName(String name) {
			System.out.println("invoked finding name");

			return null;
		}

		public void saveBusRoute(BusRouteDTO busRouteDTO, int i) {
			System.out.println("save busRouteDTO dto and int cost:".concat(busRouteDTO.getDiverName()));
			if (i >= 0 && this.counter < this.dtos.length && this.counter >= 0 && dtos != null) {
				this.dtos[this.counter++] = busRouteDTO;
				System.out.println("save busRouteDTO dto and int cost:".concat(String.valueOf(i)));
			} else {
				System.out.println("Cannot save the busRouteDTO :".concat(String.valueOf(this.counter)));
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

		public void displayAllBusDetails() {
			System.out.println("invoked displayAllBusDetails ");
		}

		public void saveBusRoute1(BusRouteDTO busRouteDTO, int i) {
			// TODO Auto-generated method stub
			
		}


			
		} 

	


