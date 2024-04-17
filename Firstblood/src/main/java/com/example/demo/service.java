package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
@Autowired
Repo s;
public String add(Model m)
{
s.save(m);
return "Done";
}
}