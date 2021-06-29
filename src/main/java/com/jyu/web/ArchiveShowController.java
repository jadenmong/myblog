package com.jyu.web;

import com.jyu.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArchiveShowController {


    private final BlogService blogService;

    @Autowired
    public ArchiveShowController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/archives")
    public String archives(Model model) {
        model.addAttribute("archiveMap", blogService.archiveBlog());
        model.addAttribute("blogCount", blogService.countBlog());
        return "archives";
    }
}
