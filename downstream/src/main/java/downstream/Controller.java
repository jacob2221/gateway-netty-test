package downstream;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@PostMapping("/mock/load")
	public Request postResp(@RequestBody Request req) {
		return req;
	}

}
