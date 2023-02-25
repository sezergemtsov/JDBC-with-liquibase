package ru.netology.jdbc.model;

public record Order(int id, String date, int customerId, String productName, int amount) {
}
