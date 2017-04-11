package edu.carleton.comp2601Final;

import com.google.gson.Gson;

import edu.carleton.COMP2601.communication.Event;
import edu.carleton.COMP2601.communication.EventHandler;
import edu.carleton.COMP2601.communication.Fields;

public class NewListHandler implements EventHandler{

	@Override
	public void handleEvent(Event event) {
		Gson gson = new Gson();
		String listStr = event.get(Fields.LIST).toString();
		System.out.print(listStr);
		List list = gson.fromJson(listStr, List.class);
		Server.addList(list);
	}

}
