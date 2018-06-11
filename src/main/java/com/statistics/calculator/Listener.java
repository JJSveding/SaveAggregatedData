package com.statistics.calculator;

import org.apache.activemq.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Listener {

    @Autowired
    AggregatedStats_Service ASAService;

    @JmsListener(destination = "sendStatistics")
    public void receiveMessage(final Message jsonmessage){
        String message = Utility.readMessage(jsonmessage);
        System.out.println(message);

        List<RetrievelDataObject> list = Utility.makeObject(message);
        //System.out.println(list.get(0).getAttendedMinutes());

        for (RetrievelDataObject object: list) {
            AggregatedStats ASA = new AggregatedStats();
            ASA.setCourseID(object.getCourseID());
            ASA.setCourseName(object.getCourseName());
            ASA.setStudentID(object.getStudentID());
            ASA.setStudentName(object.getStudentName());
            ASA.setStudentSurname(object.getStudentSurname());
            ASA.setTotalCourseMinutes(object.getTotalCourseMinutes());
            ASA.setAttendedMinutes(object.getAttendedMinutes());


            double attendancePercentage = (double)object.getAttendedMinutes()/(double)object.getTotalCourseMinutes()*100;
            attendancePercentage = Math.round(attendancePercentage);
            ASA.setAttendancePercentage(attendancePercentage);

            ASAService.save(ASA);
        }



    }
}
