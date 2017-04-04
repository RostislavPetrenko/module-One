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

public class ShowReader {

	String file = "schedule.json";

	public List<Show> read() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONArray array = (JSONArray) parser.parse(new FileReader(file));

		List<Show> resultList = new ArrayList<Show>();

		for (Object objectShow : array) {

			JSONObject obj = (JSONObject) objectShow;

			Show currentShow = new Show();

			currentShow.setDate((String) obj.get("date"));
			currentShow.setTime((String) obj.get("time"));
			currentShow.setID((String) obj.get("id"));
			currentShow.setName((String) obj.get("name"));
			
			resultList.add(currentShow);
		}
		return resultList;
	}

}
