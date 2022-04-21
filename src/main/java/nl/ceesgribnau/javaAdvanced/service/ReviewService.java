package nl.ceesgribnau.javaAdvanced.service;

import nl.ceesgribnau.javaAdvanced.model.Review;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ReviewService {
    private List<Review> reviews;

    public ReviewService() {
        this.reviews = Arrays.asList(
                new Review(1, "Review 1", "Dit is review 1", 5),
                new Review(2, "Review 2", "Dit is review 2", 2),
                new Review(3, "Review 3", "Dit is review 3", 4)
        );
    }

    public List<Review> getAllRieviews() {
        return reviews;
    }
}
