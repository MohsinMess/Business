package website.backend.dao;

import java.util.List;

import website.backend.dto.category;

public interface categorydao {
	
	List<category>	list();	
	category get(int id);  // to fetch a single category
	
}
