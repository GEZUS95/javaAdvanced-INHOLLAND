package nl.ceesgribnau.javaAdvanced.controller;

import nl.ceesgribnau.javaAdvanced.model.Review;
import nl.ceesgribnau.javaAdvanced.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reviews")

public class ReviewController {

    @Autowired
    private ReviewService service;

    @GetMapping()
    public ResponseEntity getAllReviews() {
        return ResponseEntity.status(200).body(service.getAllReviews());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity getReviewById(@PathVariable int id) {
        return ResponseEntity.status(200).body(service.getReviewById(id));
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity deleteReviewById(@PathVariable int id) {
        service.deleteReviewById(id);
        return ResponseEntity.status(200).body("Successfully removed");
    }

    @PostMapping()
    public ResponseEntity createReview(@RequestBody Review review) {
        service.createReview(review);
        return ResponseEntity.status(HttpStatus.CREATED).body(review.getId());
    }
}
