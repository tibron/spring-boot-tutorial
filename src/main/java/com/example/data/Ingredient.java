package com.example.data;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@Setter
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {WRAP, PROTEINE, VEGGIES, CHEESE, SAUSE}
}
