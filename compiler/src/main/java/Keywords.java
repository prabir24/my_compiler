import java.util.ArrayList;
import java.util.HashMap;

public final class Keywords {
	
	@SuppressWarnings("serial")
	HashMap<String, String> symbols = new HashMap<String, String>() {{
		put("<", "open_tag");
		put(">", "close_tag");
		put("/", "backslash");
		put("\"", "quote");
		put(":", "colon");
		put(".", "dot");
		put("\n", "new_line");
		put("?", "question");
		put("\t", "tab");
		put("=", "equal_to");
	}};
	
	@SuppressWarnings("serial")
	ArrayList<String> tag= new ArrayList<String>() {{
		add("xml");
		add("graphml");
		add("graph");
		add("port");
		add("data");
		add("node");
		add("edge");
	}};
			
	@SuppressWarnings("serial")
	ArrayList<String> node_tag_attr_name = new ArrayList<String>() {{
		add("id");
		add("type");
	}};
	
	@SuppressWarnings("serial")
	ArrayList<String> edge_tag_attr_name = new ArrayList<String>() {{
		add("source");
		add("target");
		add("type");
		add("sourceport");
		add("targetport");
	}};
	
	@SuppressWarnings("serial")
	ArrayList<String> port_tag_attr_name = new ArrayList<String>() {{
		add("name");
	}};
	
	@SuppressWarnings("serial")
	ArrayList<String> data_tag_attr_name = new ArrayList<String>() {{
		add("attr.name");
		add("attr.type");
	}};
	
}
