package nl.ceesgribnau.javaAdvanced.service;

import nl.ceesgribnau.javaAdvanced.model.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    private List<Review> reviews = new ArrayList<>();

    public ReviewService() {
        this.reviews.add(new Review(1, "Review 1", "Dit is review 1", 5));
        this.reviews.add(new Review(2, "Review 2", "Dit is review 2", 2));
        this.reviews.add(new Review(3, "Review 3", "Dit is review 3", 4));
    }

    public List<Review> getAllReviews() {
        return reviews;
    }

    public Review getReviewById(int id) {
        return reviews.get(id - 1);
    }

    public void deleteReviewById(int id) {
        reviews.remove(id - 1);
    }

    public void createReview(Review review) {
        reviews.add(review);
    }
}
