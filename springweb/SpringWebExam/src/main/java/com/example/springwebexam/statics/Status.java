package com.example.springwebexam.statics;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    UNCONFIRMED("Unconfirmed"),CONFIRMATION("Confirmation"), REJECTED("Rejected");

    String name;
}