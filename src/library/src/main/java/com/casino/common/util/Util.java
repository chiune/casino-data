package com.casino.common.util;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import lombok.Getter;

@Service
public class Util {

    @Getter
    private final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss:S");
}