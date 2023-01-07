package io.github.rjaros87;

import io.micronaut.http.annotation.*;

@Controller("/playgroundMicronautReactorServer")
public class PlaygroundMicronautReactorServerController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}