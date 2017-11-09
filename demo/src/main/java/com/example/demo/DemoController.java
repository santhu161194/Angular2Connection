package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class DemoController {

    static List<Item> items = Arrays.asList(new Item("Demo", "1"), new Item("Example", "2"), new Item("Test", "3"));

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List search(HttpServletResponse response) {
        System.out.println(items);
        System.out.println(items.stream());
        return items.stream()
                /*.filter(item -> item.name.toUpperCase().contains(searchTerm.toUpperCase()))*/
                .collect(toList());
    }

}

class SearchParams {
    String status;
    String categoryId;
    String searchTerm;

    public SearchParams(String status, String categoryId, String searchTerm) {
        this.status = status;
        this.categoryId = categoryId;
        this.searchTerm = searchTerm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}

class Item {

    public String name;
    public String id;

    Item(String name, String id) {
        this.name = name;
        this.id = id;
    }
}