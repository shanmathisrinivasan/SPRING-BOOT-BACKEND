package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
service s;
@PostMapping("/create")
public String add(@RequestBody Model m)
{
s.add(m);
return "added";
}

}