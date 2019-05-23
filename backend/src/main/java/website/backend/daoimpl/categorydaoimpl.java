package website.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import website.backend.dao.categorydao;
import website.backend.dto.category;


@Repository("CategoryDAO")
public class categorydaoimpl implements categorydao {

	public static List<category> categories = new ArrayList<>();

	static {
		category Category = new category();
		Category.setId(1);
		Category.setName("T-shirt");
		Category.setDescription("Mens Casual Clothes");

		categories.add(Category);

		Category = new category();
		Category.setId(2);
		Category.setName("Shirt");
		Category.setDescription("Mens Formal Clothes");

		categories.add(Category);

		Category = new category();
		Category.setId(3);
		Category.setName("Pants");
		Category.setDescription("Mens bottomwear Clothes");

		categories.add(Category);

	}

	@Override
	public List<category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public category get(int id) {
		//enhanced for loop
		for(category Category:categories)
		{
			if (Category.getId()==id) return Category;
		}
		
		return null;
	}

}
