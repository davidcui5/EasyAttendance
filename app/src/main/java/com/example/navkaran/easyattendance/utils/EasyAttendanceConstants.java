package com.example.navkaran.easyattendance.utils;

/**
 * @author Navkaran Kumar
 * A place holder for the constants used for passing extras between activities
 * and other constants such as request codes or baseURL which are shared between activities
 */
public class EasyAttendanceConstants {
    public static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;

    //for accessing extras
    public static final String COURSE_KEY = "COURSE_KEY";
    public static final String COURSE_ID = "COURSE_ID";
    public static final String COURSE_NAME = "COURSE_NAME";
    public static final String COURSE_STUDENT_COUNT = "COURSE_STUDENT_COUNT";

    public static final int NEW_COURSE_ACTIVITY_REQUEST_CODE = 1;
    public static final int EDIT_COURSE_ACTIVITY_REQUEST_CODE = 2;
    public static final String ATTENDANCE_COUNT = "ATTENDANCE_COUNT";
    public static final String LECTURE_ID = "LECTURE_ID";

    //Custom API created for handling the remote database
    public static final String API_URL = "https://web.cs.dal.ca/~stang/csci5708/";
}
