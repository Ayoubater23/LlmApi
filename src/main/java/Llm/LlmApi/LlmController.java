package Llm.LlmApi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LlmController {
    private final LlmService llmService;


    public LlmController(LlmService llamaService) {
        this.llmService = llamaService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generate(@RequestBody LlmRequest request ) {
        try {
            String response = llmService.generate(request.prompt());
            return ResponseEntity.ok(response);
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Generate failed");
        }
    }

}

