package serversidelogic;

import java.util.List;

public class Booking {
	
	private String reservationId;
	private String showId;
	private List<Seat> seats;
	
	public String getReservationId() {
		return reservationId;
	}
	
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	
	public String getShowId() {
		return showId;
	}
	
	public void setShowId(String showId) {
		this.showId = showId;
	}
	
	public List<Seat> getSeats() {
		return seats;
	}
	
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	
	

	
}
