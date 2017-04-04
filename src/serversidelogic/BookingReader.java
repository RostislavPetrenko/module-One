package serversidelogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BookingReader {

	String file = "booking.json";

	public List<Booking> readBookingInfo() throws FileNotFoundException, IOException, ParseException {

		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(new FileReader(file));

		List<Booking> result = new ArrayList<Booking>();
		

		for (Object objectShow : array) {
			
			JSONObject obj = (JSONObject) objectShow;
			Booking booking = new Booking();
			List<Seat> seatsNum = new ArrayList<Seat>();
			
			
			booking.setReservationId((String) obj.get("reservationid"));
			booking.setShowId((String) obj.get("showid"));
			
			
			JSONArray arraySeats = (JSONArray)(obj.get("seat"));
			for (Object seats : arraySeats) {
				
				Seat seat = new Seat();
				seat.setNumber ((int)(obj.get("seatNumber")));
				seatsNum.add(seat);
			}
			
			booking.setSeats(seatsNum);
			result.add(booking);
			

		}
		return result;
	}
	
	
	public String writerInf(){
		
	}

}
