/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linecharttest;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


//String out = new Scanner(new URL("http://www.google.com").openStream(), "UTF-8").useDelimiter("\\A").next(); 

public class GetHtmlText {
    String[] result;  //Массив всех получаемых значений (Уровень рыбы, температуры)
    
    //new line
    Double tank1level;
    Double tank1leve2;
    Double tank1leve3;
    Double tank1leve4;
    Double tank1leve5;
    Double tank1leve6;
    
    
    public GetHtmlText() {
            try{
                String stringHtmlText = new Scanner(new URL("http://172.20.106.90/cgi-bin/cgi.cgi?ControlData&Random=12345678").openStream(), "UTF-8").useDelimiter("\\A").next();  // GODLIKE!
                int newLineIndex = stringHtmlText.indexOf("\n")+1;             
                String secondString = stringHtmlText.substring(newLineIndex, stringHtmlText.length());  //вырезаем нижнюю строку со значениями
                secondString = secondString.replace("\"","");               
                System.out.println(secondString);
                result = secondString.split(",");
                
                System.out.println("Уровень первого рыбного танка " + result[52]);
                System.out.println("Уровень второго рыбного танка " + result[55]);
                System.out.println("Уровень третьего танка " + result[58]);
                System.out.println("Уровень четверното танка " + result[61]);
                System.out.println("Уровень пятого танка " + result[64]);
                System.out.println("Уровень шестого танка " + result[67]);
                

            }catch(IOException ex){ 
                System.out.println(ex.getMessage());
            }
            
            tank1level = Double.parseDouble(result[52]);    //52
            tank1leve2 = Double.parseDouble(result[55]);    //55
            tank1leve3 = Double.parseDouble(result[58]);    //58
            tank1leve4 = Double.parseDouble(result[61]);    //61
            tank1leve5 = Double.parseDouble(result[64]);    //64
            tank1leve6 = Double.parseDouble(result[67]);    //67
    }

    public Double getTank1level() {
        return tank1level;
    }

    public Double getTank1leve2() {
        return tank1leve2;
    }

    public Double getTank1leve3() {
        return tank1leve3;
    }

    public Double getTank1leve4() {
        return tank1leve4;
    }

    public Double getTank1leve5() {
        return tank1leve5;
    }

    public Double getTank1leve6() {
        return tank1leve6;
    }


    
    
}

