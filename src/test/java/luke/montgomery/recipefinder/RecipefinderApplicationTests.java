package luke.montgomery.recipefinder;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;


import luke.montgomery.recipefinder.model.RecipeModel;
import luke.montgomery.recipefinder.repository.RecipeRepository;


public class RecipefinderApplicationTests {
	
	@Bean
    public MongoTemplate mongoTemplate(MongoDbFactory mongoDbFactory,
                                       MongoMappingContext context) {

        MappingMongoConverter converter =
                new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory), context);
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory, converter);

        return mongoTemplate;

    }
	
	RecipeModel model;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private RecipeRepository repo;
	
	@Before
	public void setUp() {
		String[] ing = {"test"};
		model = new RecipeModel("title", "instructions", ing, "picture" );
		
	}
	
	@Test
	public void testGetByTitle() {
		repo.save(model);
		assertEquals("title", repo.findByTitle("title"));
		
	}
 
}

