package com.tutor.yepp.controllers;


import com.tutor.yepp.models.PostOffice;
import com.tutor.yepp.service.PostOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/postOffices")
public class PostOfficeController {

    @Autowired
    private PostOfficeService postOfficeService;

    @PostMapping
    public ResponseEntity<PostOffice> addPostOffice(@RequestBody PostOffice postOffice) {
        PostOffice createdPostOffice = postOfficeService.addPostOffice(postOffice);
        return ResponseEntity.ok(createdPostOffice);
    }

    @DeleteMapping("/posts/{index}")
    public ResponseEntity<Void> deletePostOffice(@PathVariable String index) {
        postOfficeService.deletePostOffice(index);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/posts/{index}")
    public ResponseEntity<PostOffice> getPostOfficeById(@PathVariable String index) {
        Optional<PostOffice> postOffice = postOfficeService.getPostOfficeById(index);
        return postOffice.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<PostOffice> getAllPostOffices() {
        return postOfficeService.getAllOffices();
    }
}
