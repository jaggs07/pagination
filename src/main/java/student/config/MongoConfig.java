package student.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	// get the database name
	@Override
	protected String getDatabaseName() {

		return "pagination";
	}

	// configures the mongo client
	@Override
	public Mongo mongo() throws Exception {

		return new MongoClient("127.0.0.1", 27017);
	}
}

/*
import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;


@Configuration
public class MongoConfig {

    @Test
    public void firstTest() throws Exception {
        MongoClient mongoClient = null;
        MongoCredential mongoCredential = MongoCredential
    			.createMongoCRCredential("jaggs", "page",
    					"jaggs".toCharArray());
        try {
    		mongoClient = new MongoClient(new ServerAddress(
    				"127.0.0.1", 27017),
    				Arrays.asList(mongoCredential));
    	}
        finally {
            try {
                mongoClient.close();
            } catch (Exception e2) {
            }
        }
    }

}
*/