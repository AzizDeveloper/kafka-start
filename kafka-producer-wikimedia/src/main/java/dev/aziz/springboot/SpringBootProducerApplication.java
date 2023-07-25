package dev.aziz.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProducerApplication.class);
    }

    @Autowired
    private WikimediaChangesProducer wikimediaChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }

    //TODO: https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbVFBOHBxQ2c2TmpwM21HZVdudlpTZi1aYjNjZ3xBQ3Jtc0tuby1uX3BxeTR0Wlo4X3dwR2J1VDRib21PUWJ5Mjk0RURjLTZZZ3F3bjI3cDFOUkhnR3kwNllFSFUxeTh5Y3lndVJnVXptalQwejY3am5kQ3R3eVd2LTVqcE5ZT2M4VTFsalRiVDVHT05ucnI5c0NvOA&q=https%3A%2F%2Fgithub.com%2FRameshMF%2Fspringboot-kafka-course%2Ftree%2Fmain%2Fspringboot-kafka-real-world-project&v=TkhU8d-uao8
}
