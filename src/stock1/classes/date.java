/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock1.classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author ANURANGA
 */
public class date {
    
    Calendar cal=new GregorianCalendar();
    
    public String Date(){
        java.util.Date d=new java.util.Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(d);
        return date;
    }
    public void time(final JLabel l){
    
    new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
          
            
            java.util.Date d =new java.util.Date();
            SimpleDateFormat df=new SimpleDateFormat("hh:mm:ss");
            String date = df.format(d);
            l.setText(date);
            
        }
    }).start();
    
    }
    public String generateTime(){
        int second=cal.get(cal.SECOND);
        int minute=cal.get(cal.MINUTE);
        int hour=cal.get(cal.HOUR);
        return hour+":"+minute+":"+second;
    }
    
    
    
    
    }
        
        
    
    
    
    
    
    

