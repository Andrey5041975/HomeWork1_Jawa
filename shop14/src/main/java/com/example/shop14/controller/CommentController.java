package com.example.shop14.controller;

import com.example.shop14.entity.Comment;
import com.example.shop14.entity.Product;
import com.example.shop14.repo.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;


    @DeleteMapping("/comments/{id}")
    public ResponseEntity<HttpStatus> deleteComment(
            @PathVariable Long id
    )
    {
        commentRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/comments/{id}")
    public Optional<Comment> getCommentById(
            @PathVariable Long id
    )
    {
        return commentRepository.findById(id);
    }

    /*
    // POST http://localhost:8080/products/%7BproductId%7D/comments - добавление коммента к продукту
public ResponseEntity createComment(
    Long productId,
    Comment comment
)
    */

    @PostMapping("http://localhost:8080/products/{productId") // - добавление коммента к продукту
    public ResponseEntity createComment(
           @PathVariable Long productId,
            Comment comment
    )
    {
        //это тоже не додумано
        commentRepository.findById(productId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}