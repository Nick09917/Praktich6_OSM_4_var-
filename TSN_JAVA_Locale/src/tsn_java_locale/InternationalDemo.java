package tsn_java_locale;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class InternationalDemo {

    public static void main(String[] args) throws IOException {
        String country = "", language = "";
        System.out.println("1 � ����������");
        System.out.println("2 � ��������");
        System.out.println("3 � �����������");
        System.out.println("4 � ���������");
        System.out.println("����� ������ ������ � �������");
        char i = (char) System.in.read();
        switch (i) {
            case '1':
                language = "en";
                country = "US";
                break;
            case '2':
                language = "de";
                country = "DE";
                break;
            case '3':
                language = "fr";
                country = "FR";
                break;
            case '4':
                language = "es";
                country = "ES";
                break;        
        }
        ResourceBundle rb = ResourceBundle.getBundle("text", new Locale(language, country));
        
        /// ������ ������
        String qst1 = (getStr(rb.getString("my.question"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.question"), rb.getString("utf16")));
        System.out.println("1: " + getStr(rb.getString("my.answer1"), rb.getString("utf16")));
        System.out.println("2: " +getStr(rb.getString("my.answer2"), rb.getString("utf16")));
        System.out.println("3: " +getStr(rb.getString("my.answer3"), rb.getString("utf16")));
        ///�������� ������ �� ������������
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String Answer1 = "";
        if(count == 1 ){
          Answer1 = (getStr(rb.getString("my.answer1"), rb.getString("utf16")));
        }
        if(count == 2){
            Answer1 = (getStr(rb.getString("my.answer2"), rb.getString("utf16")));
        }
        if(count == 3){
             Answer1 = (getStr(rb.getString("my.answer3"), rb.getString("utf16")));
        }
        
        
        /// ������ ������
        String qst2 = (getStr(rb.getString("my.question2"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.question2"), rb.getString("utf16")));
        System.out.println("1: " + getStr(rb.getString("my.answer4"), rb.getString("utf16")));
        System.out.println("2: " +getStr(rb.getString("my.answer5"), rb.getString("utf16")));
        System.out.println("3: " +getStr(rb.getString("my.answer6"), rb.getString("utf16")));
       
        int count2 = sc.nextInt();
        String Answer2 = "";
        if(count2 == 1 ){
          Answer2 = (getStr(rb.getString("my.answer4"), rb.getString("utf16")));
        }
        if(count2 == 2){
            Answer2 = (getStr(rb.getString("my.answer5"), rb.getString("utf16")));
        }
        if(count2 == 3){
             Answer2 = (getStr(rb.getString("my.answer6"), rb.getString("utf16")));
        }
        
        ///������ ������
        String qst3 = (getStr(rb.getString("my.question3"), rb.getString("utf16")));
        System.out.println(getStr(rb.getString("my.question3"), rb.getString("utf16")));
        System.out.println("1: " + getStr(rb.getString("my.answer7"), rb.getString("utf16")));
        System.out.println("2: " +getStr(rb.getString("my.answer8"), rb.getString("utf16")));
        System.out.println("3: " +getStr(rb.getString("my.answer9"), rb.getString("utf16")));
       
        int count3 = sc.nextInt();
        String Answer3 = "";
        if(count3 == 1 ){
          Answer3 = (getStr(rb.getString("my.answer7"), rb.getString("utf16")));
        }
        if(count3 == 2){
            Answer3 = (getStr(rb.getString("my.answer8"), rb.getString("utf16")));
        }
        if(count3 == 3){
             Answer3 = (getStr(rb.getString("my.answer9"), rb.getString("utf16")));
        }
    
    
   /// ���������� �������
    System.out.println("������ ������ � �����:" + qst1 +"\n" + Answer1);
     System.out.println("������ ������ � �����:" + qst2 +"\n" + Answer2);
     System.out.println("������ ������ � �����:" + qst3 +"\n" + Answer3);
    
    
    }
    
    
    

    public static String getStr(String text, String utf16) throws UnsupportedEncodingException {
        if (!utf16.equals("true")) {
            return new String(text.getBytes("ISO-8859-1"), "Windows-1251");
        } else {
            return text;
        }
    }

}
