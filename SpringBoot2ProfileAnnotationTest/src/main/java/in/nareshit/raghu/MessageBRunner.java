package in.nareshit.raghu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default","prod"})
public class MessageBRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("FROM DEV[default]/PROD ENV");
	}

}
