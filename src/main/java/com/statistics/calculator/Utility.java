package com.statistics.calculator;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.activemq.Message;

import javax.jms.TextMessage;
import java.util.List;

public class Utility {

    public static String readMessage(Message jsonmessage){
        if(jsonmessage instanceof TextMessage){
            TextMessage textMessage = (TextMessage) jsonmessage;

            try{
                System.out.println(textMessage.getText());
                return textMessage.getText();
            }catch (Exception e)
            {
                //NOTHING
            }
        }
        return "ERROR";
    }


    public static List<RetrievelDataObject> makeObject(String objectMessage){

        ObjectMapper mapper = new ObjectMapper();
        List<RetrievelDataObject> list = null;

        try{
           list = mapper.readValue(objectMessage,new TypeReference<List<RetrievelDataObject>>(){});
        }catch (Exception e)
        {
            //NOTHING
        }

        return list;


    }
}
