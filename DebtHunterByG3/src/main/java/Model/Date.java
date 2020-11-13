/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author KaiNiYam
 */
public class Date {
        public static void main(String[] args) {
       LocalDate date = LocalDate.now(); 
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
System.out.println(java.time.LocalDate.now()); 
    }
}
