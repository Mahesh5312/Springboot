package com.springboot;


import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by pulapakas on 24-02-2017.
 */
@Transactional
@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

   @Autowired
    private StudentService service;
@RequestMapping(value = "/",method = RequestMethod.GET)
   public  List<StudentPojo> findByName( String name)
   {

       log.info("Getting Student ByName");
       return Lists.newArrayList(service.findStudentsByName(name));


    }
}
