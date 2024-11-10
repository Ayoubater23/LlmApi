package Llm.LlmApi;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class LlmService {
    private final ChatModel chatModel;

    public LlmService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String generate(String prompt){
        try{
            return chatModel.call(prompt);
        }catch(Exception e){
            e.printStackTrace();
            return "error in generating";
        }
    }
}
