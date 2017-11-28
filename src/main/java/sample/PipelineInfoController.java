package sample;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pacharya on 7/31/2017.
 */
@RestController
@EnableAutoConfiguration
public class PipelineInfoController {


    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    public List<String> getStatus() {
      return Arrays.asList("Joke of the Day!!!");

    }



}
