package restUtilites;

import java.util.HashMap;
import java.util.Map;

public class apiBulider {

	
	public Map<String, String> defaultHeader(){
		Map<String, String> body=new HashMap<String, String>();
		body.put("name","");
		return body;
	}
}
