package serversidelogic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;

public class Service {

	ShowReader showsReader;
	BookingReader bookingReader;

	public Service(ShowReader schedule, BookingReader booking) {
		this.showsReader = schedule;
		this.bookingReader = booking;
	}

	public List<Show> getShowsSchedule() throws FileNotFoundException, IOException, ParseException {
		List<Show> showSchedule = showsReader.read();
		return showSchedule;
	}

	public Booking getBookingInfo(String id) throws FileNotFoundException, IOException, ParseException {

		List<Booking> bookingInfo = bookingReader.readBookingInfo();

		for (Booking booking : bookingInfo) {
			if (booking.getShowId().equals(id)) {
				return booking;
			}
		}
		return null;
	}

	public void cancelBooking() {
		

	}

	public void bookSeats() {

	}

}
