package gov.noaa.ncei.next

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class ApplicationSpec extends Specification {

    @Autowired
    private final RabbitTemplate rabbitTemplate

    def "when context is loaded then all expected beans are created"() {
        expect: "rabbitTemplate is provided"
        rabbitTemplate
    }
}