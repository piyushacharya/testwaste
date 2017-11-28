package sample;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@EnableAutoConfiguration
public class StartService {
    public static void main(String[] args) {
        Object[] sources = new Object[2];
        sources[0] = PipelineInfoController.class;
        sources[1] = StartService.class;


        HashMap<String, Object> props = new HashMap<String,Object>();
        props.put("server.port", 8091);


        new SpringApplicationBuilder()
                .sources(sources)
                .properties(props)
                .run(args);


    }

}
