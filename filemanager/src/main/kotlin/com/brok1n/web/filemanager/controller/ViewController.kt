package com.brok1n.web.filemanager.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class ViewController {


    @GetMapping("/appList")
    fun appList():ModelAndView {
        val map = HashMap<String, String>()
        map.put("user", "brok1n")
        val obj = ModelAndView()
        obj.addObject("data", map)
        obj.viewName = "app_list.html"
        return obj
    }

    @GetMapping("/")
    fun index():ModelAndView {
        val map = HashMap<String, String>()
        map.put("user", "brok1n")
        val obj = ModelAndView()
        obj.addObject("data", map)
        obj.viewName = "index.html"
        return obj
    }


}