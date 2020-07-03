package org.eclipse.leshan.server.demo.DB;


// import java.util.Set;
// import com.mongodb.DB;
// import com.mongodb.MongoClient;
// import com.mongodb.ServerAddress;

public class MongoDBConnector {
    public static void main (){
        // String MongoDB_IP = "127.0.0.1";
        // int MongoDB_PORT = 27017;
        // String DB_NAME = "testDB";
     
        // //Connect to MongoDB
        // MongoClient  mongoClient = new MongoClient(new ServerAddress(MongoDB_IP, MongoDB_PORT));
        // DB db = mongoClient.getDB(DB_NAME);
        // DBCollection collection = db.getCollection("testCollection02");
        
    }

    public static Firmware FindOne(){
        return new Firmware("90", "91", "hello.com");
    }
}