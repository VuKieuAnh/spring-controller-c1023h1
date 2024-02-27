package org.example.springc1023.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
//dinh nghia tien to cho toan bo request method ben trong
public class StudentController {
    @GetMapping("/")
    public String showAllStudent(){
        return "index";
    }

    @GetMapping("/create")
    public String showFromCreate(){
        return "create";
    }
    @PostMapping("/create")
    public String createNewStudent(@RequestParam String name){
        System.out.println("Luu lai student");
        return "forward:/";
//        return "redirect:/student/"+ name;
//        return "forward:/";
    }
    @GetMapping("/{name}")
    public ModelAndView detail(@PathVariable String name){
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("name", name);
        return modelAndView;
    }


    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable Long id){
        System.out.println("id "+ id);
        return "index";
    }

//    @GetMapping("/detail/{name}")
//    public String showDetail(@PathVariable String name){
////        chi chua view
////        khong co du lieu
//        System.out.println("name "+ name);
//        return "index";
//    }

    @GetMapping("/delete")
    public String delete(@RequestParam Long id, @RequestParam String name, Model model){
        System.out.println("id " + id);
        System.out.println("name " + name);
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "index";
    }
    @GetMapping("/delete1")
    public String delete( @RequestParam String name, ModelMap model){
//        System.out.println("id " + id);
        System.out.println("name " + name);
//        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "index";
    }

//    @GetMapping("/detail")
//    public ModelAndView detail(@RequestParam String name){
//        ModelAndView modelAndView = new ModelAndView("index");
////        co nhieu du lieu muon day cho view
//        modelAndView.addObject("name", name);
//        return modelAndView;
//    }
    @GetMapping("/detail1")
    public ModelAndView detail1(@RequestParam String name){
//        trong th chi co 1 du kieu
        ModelAndView modelAndView = new ModelAndView("index","name", name );
        return modelAndView;
    }
}
