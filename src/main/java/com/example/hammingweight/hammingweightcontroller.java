package com.example.hammingweight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hammingweightcontroller {

    @GetMapping("/hamming-weight")
    public int calculateHammingWeight(@RequestParam("number") String number) {
        int hammingWeight = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                hammingWeight++;
            }
        }
        return hammingWeight;
    }






}
