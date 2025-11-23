package com.example.memo;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemoController {
    private final MemoService memoService;

    public MemoController(MemoService memoService){
        this.memoService = memoService;
    }

    @GetMapping("/")
    public String getMemo(Model model){
        String message = memoService.getMessage();
        model.addAttribute("message", message);
        return "index";
    }
}
