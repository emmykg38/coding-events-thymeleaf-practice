package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String showEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("First Fridays at California Co-op");
        events.add("Saturday Farmer's Market");
        events.add("Layla's football game");
        events.add("Festival of Nations");
        events.add("Japanese Festival at MoBot");
        model.addAttribute("events", events);
        return "events/index";
    }


    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
    }


}
