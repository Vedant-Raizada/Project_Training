package mongoJdbc;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class Main {

    public static void main(String[] args) {

        MongoClient client = MongoClients.create("mongodb+srv://Vedant_Raizada:12345@cluster0.4mgub.mongodb.net/sampleDB?retryWrites=true&w=majority");

        MongoDatabase db = client.getDatabase("sampleDB");

        MongoCollection col = db.getCollection("sampleCollection");

        Document sampleDoc = new Document("_id", "7").append("name", "Ram");

        col.insertOne(sampleDoc);

    }
}