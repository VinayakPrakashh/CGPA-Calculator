/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class GradeConverter {

    public static int convert(String grade) {
        if ("S".equalsIgnoreCase(grade)) {
            return 10;
        } else if ("A".equalsIgnoreCase(grade)) {
            return 9;
        } else if ("B".equalsIgnoreCase(grade)) {
            return 8;
        } else if ("C".equalsIgnoreCase(grade)) {
            return 7;
        } else if ("D".equalsIgnoreCase(grade)) {
            return 6;
        } else if ("E".equalsIgnoreCase(grade)) {
            return 5;
        } else if ("F".equalsIgnoreCase(grade)) {
            return 0;
        } else {
            return -1;
        }
    }
}
