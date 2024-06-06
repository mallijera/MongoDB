package com.example.sprin_boot_mongodb_tutorial.repository;

import com.example.sprin_boot_mongodb_tutorial.expense.Expense;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    @Query("{'name': ?0}")
    Optional<Expense> findByName (String name);
}
