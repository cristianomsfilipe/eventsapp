package pt.training.eventsapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class EventController {

	@RequestMapping("/insertEvent")
	public String form() {
		return "event/formEvent";
	}
}
