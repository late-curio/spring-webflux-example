package latecurio.webfluxeg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class Controller {

    @GetMapping("/some1")
    public Mono<String> some1() {
        return Mono.just("1");
    }


    @GetMapping("/some2")
    public Mono<String> some2() {
        return Mono.just("2");
    }


    @GetMapping("/some3")
    public Mono<String> some3() {
        return Mono.just("3");
    }


    @GetMapping("/some4")
    public Mono<String> some4() {
        return Mono.just("4");
    }


    @GetMapping("/some5")
    public Mono<String> some5() {
        return Mono.just("5");
    }


    @GetMapping("/some6")
    public Mono<String> some6() {
        return Mono.just("6");
    }


    @GetMapping("/some7")
    public Mono<String> some7() {
        return Mono.just("7");
    }


    @GetMapping("/some8")
    public Mono<String> some8() {
        return Mono.just("8");
    }


    @GetMapping("/some9")
    public Mono<String> some9() {
        return Mono.just("9");
    }


    @GetMapping("/some10")
    public Mono<String> some10() {
        return Mono.just("10");
    }
}
