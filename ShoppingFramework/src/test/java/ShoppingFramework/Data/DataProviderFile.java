package ShoppingFramework.Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataProviderFile {
	//converting JSON to String !---utility FileUtils
	public List<HashMap<String,String>> jsonData(String filepath) throws IOException {
	String jsonFile = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);
	//converting String to hashmap !---Jackson databind
	ObjectMapper objmap=new ObjectMapper();
	List<HashMap<String,String>> objfile=objmap.readValue(jsonFile, new TypeReference<List<HashMap<String,String>>>(){});
	return objfile;
}
}	
