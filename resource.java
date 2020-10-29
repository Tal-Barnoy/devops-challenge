package challange.dockerspringboot;



import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static challange.dockerspringboot.Constants.TABLE_NAME;

import static challange.dockerspringboot.func_res.getDynamoDB;


@RestController
@RequestMapping("/secret")
public class resource {

    @GetMapping
    public String getCode() {


        HashMap<String, AttributeValue> key =  new HashMap<String,AttributeValue>();
        key.put("code_name",new AttributeValue("thedoctor"));
        GetItemRequest request = new GetItemRequest().withKey(key).withTableName(TABLE_NAME);
        String str = "";
        try{

            Map<String,AttributeValue> returned_item = getDynamoDB().getItem(request).getItem();
            if(returned_item!=null)
            {
                str = returned_item.toString();
            }
        }
        catch(Exception e)
        {
            str = e.toString();
        }
        return str;
    }
}

