package latecurio.webfluxeg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
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

    private WebClient webClient = WebClient.create();

    @GetMapping("/doeet/{ts}")
    public Flux<String> doeet(@PathVariable String ts) {
        return Flux.just("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")
                .map(it -> webClient.get().uri("http://example.com?i=%s&ts=%i", it, System.currentTimeMillis()))
                .map(response -> response.retrieve().bodyToMono(String.class))
                .flatMap(it -> it);
    }
}
