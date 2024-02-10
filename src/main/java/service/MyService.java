package service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MyService {

    private WebClient webClient = null;

    // test commit2

    // dding comment for merge2===============>

    String myurl = "https://jgentes-crime-data-v1.p.rapidapi.com/crime?startdate=9%2F19%2F2015&enddate=9%2F25%2F2015&long=-122.5076392&lat=37.757815";

    public MyService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(myurl).build();
    }

    public <MyService> MyService(String myurl) {
//        return this.webClient.get().uri("/{name}/details", myurl)
//              .retrieve().bodyToMono(MyService.class);
    }

}