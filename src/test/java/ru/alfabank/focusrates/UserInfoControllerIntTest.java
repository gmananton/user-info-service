package ru.alfabank.focusrates;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserInfoControllerIntTest {

    @LocalServerPort
    private int port;

    private URL indexURL;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setup() throws Exception {
        indexURL = new URL("http://localhost:" + port + "/index");
    }

    @Test
    public void getIndex() throws Exception {
        ResponseEntity<String> response = template.getForEntity(indexURL.toString(), String.class);
        Assert.assertThat(response.getBody(), Matchers.equalTo("index"));
    }

}
