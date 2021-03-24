package restUtilites;

import java.util.HashMap;
import java.util.Map;

public class apiConfigs {
	
	public Map<String, String> defaultHeader(){
		Map<String, String> defaultHeaders=new HashMap<String, String>();
		defaultHeaders.put("Content-Type","application/json");
		return defaultHeaders;
	}
	
	

}
