package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.newSample.SampleClass;

@RestController
public class AOPController {

	@GetMapping("/Studying")
    public void studying1() {
        System.out.println("I am Studying");
        SampleClass sampleClass = new SampleClass();
        sampleClass.sampleMsg("SRUSHTI");
    }


    @GetMapping("/playing/{name}")
    public void playing(@PathVariable String name) {
        System.out.println(name+" is playing");
    }

    @GetMapping("/Studying2")
    public void studying() {
        System.out.println("i am studying");
    }
    
    @GetMapping("/addnumbers/{a}/{b}")
    public int sumOfTwoNumbers(@PathVariable int a, @PathVariable int b) {
    	return a+b;
    }
}
