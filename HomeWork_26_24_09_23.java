package lesson26;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Описание задания.

 1 уровень сложности: 1. Напишите функцию replaceAllVowels, удаляющую из строки все гласные в любом регистре и возвращающую измененную строку


 2 Напишите функцию isPinCode, проверяющую, что строка является пин-кодом. Пин-код состоит из 4 или 6 цифр


3*. Напишите функцию mapAllIntsToDouble, которая бы добавляла к каждому целому в передаваемой строке ".0"
Пример: "прибыль 12 расходы 20 доходы 50.3" -> "прибыль 12.0 расходы 20.0 доходы 50.3"


4*. Посчитайте сумму цен растений из файла test.xml  - $2.44+$9.37 должно быть 11.81


 */
public class HomeWork_26_24_09_23 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("Задание 1");

        String myString = "String for rEmove volvels";
        String [] volvels  = {"a", "A",  "e", "E",  "i", "I",  "o", "O",  "u", "U"};

        System.out.println("Строка " + "'" +myString +  "'" + " без гласных букв: " + replaceAllVowels(myString, volvels));
        System.out.println();

        System.out.println("Задание 2");
        String [] numbers  = {"0", "1",  "2", "3",  "4", "5",  "6", "7",  "8", "9"};
        String intStr = "4556";
        String intStr1 = "-4556";
        String intStr2 = "99994556";
        String intStr3 = "666666";
        String intStr4 = "455W";

        System.out.println("Строка " + intStr + "; длина строки: " + intStr.length() + ";" + " является ли пин - кодом? " + isPinCode(intStr, numbers));
        System.out.println("Строка " + intStr1 + "; длина строки:  " + intStr1.length() + ";" + " является ли пин - кодом? " + isPinCode(intStr1, numbers));
        System.out.println("Строка " + intStr2 + "; длина строки:  " + intStr2.length() +  ";" +" является ли пин - кодом? " + isPinCode(intStr2, numbers));
        System.out.println("Строка " + intStr3 + "; длина строки:  " + intStr3.length() +  ";" +" является ли пин - кодом? " + isPinCode(intStr3, numbers));
        System.out.println("Строка " + intStr4 + "; длина строки:  " + intStr4.length() +  ";" +" является ли пин - кодом? " + isPinCode(intStr4, numbers));
        System.out.println();

        System.out.println("Задание 3");
        String strWithInt = "прибыль 12 расходы 20 доходы 50.3" ;
        System.out.println("Строка " + "'" +strWithInt + "'" + " после преобразование Int в Double: " +  mapAllIntsToDouble(strWithInt));
        System.out.println();

        System.out.println("Задание 4");
        // DOM parsing
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        // Document - дерево из элементов и атрибутов в памяти
        Document doc = builder.parse(new File("test.xml"));
        // корневой элемент документа
        Element root = doc.getDocumentElement();
        NodeList priceNodeList = root.getElementsByTagName("PRICE");
        double sum = 0.00;
        final DecimalFormat df = new DecimalFormat("0.00");
        for(int i = 0; i < priceNodeList.getLength(); i++)
        {
            Node priceNode = priceNodeList.item(i);
            String tmpStr = priceNode.getTextContent().replace("$", "");
           // System.out.println("tmpStr " +tmpStr);
            double tmp = Double.parseDouble(tmpStr);
            sum += tmp;
        }
        System.out.println("sum of price is: " + sum);
        System.out.println("sum of price formatted is: " + df.format(sum));
    }

    public  static String replaceAllVowels(String strIn, String[] arrSym)
    {

        for (int i =0; i < arrSym.length; i++)
        {strIn = strIn.replace(arrSym[i], "");}
        String strOut = strIn;
        return strOut;
    }

    public  static Boolean isPinCode (String strToCheck, String [] num){
        char [] ch = strToCheck.toCharArray();
        boolean res = true;
        for (int i = 0; i < ch.length; i++)
        {
            if  (((strToCheck.length() == 4) || (strToCheck.length() == 6) && (res && Character.isDigit(ch[i]) )))
            {
                res = true ;
            } else {
             res = false;}
        }
        return res;
    }

    public static String mapAllIntsToDouble (String inputStr){
        List<String> myList = new ArrayList<String>();
        myList = List.of(inputStr.split(" "));
        System.out.println(myList);
        String strOut = "";

        for (String st : myList){
            if (st.matches("\\d*")){st =  st.concat(".0");
                //System.out.println(st.matches("\\d*") + " " + st.concat(".0"));
                }
            strOut += st + " ";
        }
        return strOut;
    }

}
