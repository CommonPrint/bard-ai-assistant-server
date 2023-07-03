package org.example;


import com.pkslow.ai.GoogleBardClient;
import com.pkslow.ai.domain.Answer;
import com.pkslow.ai.domain.AnswerStatus;
import org.example.dto.BardAnswer;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/google-bard")
public class BardController {

    private final GoogleBardClient client;

    public BardController(GoogleBardClient client) {
        this.client = client;
    }

    @GetMapping("/ask")
    public BardAnswer ask(@RequestParam("q") String question) {

        Answer answer = client.ask(question);
        System.out.println("Question: " + question);

        if(answer.getStatus() == AnswerStatus.OK) {
            System.out.println("Answer code - 200!!!");
            return new BardAnswer(answer.getChosenAnswer());
        }
//
        else if(answer.getStatus() == AnswerStatus.NO_ANSWER) {
            return new BardAnswer("No answer");
        }

        throw new RuntimeException("Can't access to Google Bard AI");

    }

}
