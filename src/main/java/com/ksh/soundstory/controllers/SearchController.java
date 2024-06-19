package com.ksh.soundstory.controllers;

import com.ksh.soundstory.dtos.SearchDto;
import com.ksh.soundstory.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class SearchController {
    private final SearchService searchService;
    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }
    @RequestMapping(value="search",method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public ModelAndView getSearch(@RequestParam(required = false) String by,
                                  @RequestParam(required = false) String keyword){
        ModelAndView modelAndView = new ModelAndView();
        SearchDto searchDto = new SearchDto();
        searchDto.setBy(by);
        searchDto.setKeyword(keyword);
        modelAndView.addObject("search", this.searchService.getSearch(searchDto));
        modelAndView.addObject("search1", searchDto);
        modelAndView.setViewName("index/search");
        return modelAndView;
    }
}
