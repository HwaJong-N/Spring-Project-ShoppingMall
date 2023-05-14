package com.ghkwhd.shop.repository.review;

import com.ghkwhd.shop.domain.item.Item;
import com.ghkwhd.shop.domain.review.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewRepository {

    Review save(Review review);
    void update(Long id, Review review);
    void delete(Long id);
    Optional<Review> findById(Long id);
    List<Review> findAll(Item item);
}
