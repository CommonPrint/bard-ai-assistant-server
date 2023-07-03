package org.example.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import com.pkslow.ai.domain.Image;

@Data
@AllArgsConstructor
public class BardAnswer {
    private String chosenAnswer;
}
