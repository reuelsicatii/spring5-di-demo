package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
//@Primary
public class PrimaryEnglishGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Primary Greeting service";
	}
}
