package challange.dockerspringboot;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;

import static challange.dockerspringboot.Constants.*;

public class func_res {

    private static AWSCredentialsProvider credentialsProvider =
            new AWSStaticCredentialsProvider(
                    new BasicAWSCredentials(ACCESS_KEY, ACCESS_SECRET));

    private static AmazonDynamoDB dynamoDB =
            AmazonDynamoDBClientBuilder.standard().withCredentials(credentialsProvider).withRegion(REGION)
                    .build();

    private static DynamoDB dynamo = new DynamoDB(dynamoDB);

    private static Table table = dynamo.getTable(TABLE_NAME);

    public static Table getTable() {
        return table;
    }

    public static AmazonDynamoDB getDynamoDB() {
        return dynamoDB;
    }

    public static DynamoDB getDynamo() {
        return dynamo;
    }
}
