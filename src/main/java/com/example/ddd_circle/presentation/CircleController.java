package com.example.ddd_circle.presentation;

import com.example.ddd_circle.infrastructure.CircleRepository;
import com.example.ddd_circle.usecase.CircleGetAllDto;
import com.example.ddd_circle.usecase.CircleGetAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CircleController {

    @GetMapping("/")
    public String Index(Model model){
        CircleGetAllService circleGetAllService = new CircleGetAllService(new CircleRepository());
        List<CircleGetAllDto> circles = circleGetAllService.GetAll();

        model.addAttribute("circles", circles);

        return "index";
    }
    

}
