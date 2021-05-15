package com.company;
import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {

        String consol0 = skanerRid.func1(); //ТЗ попробовать работать с классами


      /*  Scanner in = new Scanner(System.in);
        System.out.println("Ввод: ");
        String consol0 = in.nextLine();*/

        String consol1 = consol0;
        int p1 = consol1.indexOf("\"") + 1;
        int p2 = consol1.indexOf("\"", p1);

        if (p2 > 11){
            System.out.println("Тз - значене строки не более 10 символов включительно.");
            System.exit(0);
        }

        String cifra0 = consol1.substring(p1, p2); //выдрать между указанными символами
        consol0 = consol0.replace(cifra0, "");
        consol0 = consol0.replace("\"\"", "");

        String substring = "\"";

        if (consol0.contains(substring) == true) {                      //cюда мы поподаем если во 2м числе есть одна "
            int p3 = consol0.indexOf("\"") + 1;
            int p4 = consol0.indexOf("\"", p3);
            String cifra1 = consol0.substring(p3, p4);
            consol0 = consol0.replace(cifra1, "");
            consol0 = consol0.replace("\"\"", "");
            consol0 = consol0.trim();
            String znak = consol0;
            //System.out.println(cifra0 + znak + cifra1);

            if (znak.equals("+")) {
                String result = cifra0 + cifra1;
                System.out.println("\"" + result + "\"");
                System.exit(0);
            }

            if (znak.equals("-")) {
                String result1 = cifra0.replace(cifra1, "");
                System.out.println("\"" + result1 + "\"");
                System.exit(0);
            } else {
                System.out.println("ошибка");
                System.exit(0);
            }
        }
        if (consol0.contains(substring) == false) {
            String substring1 = "*";
            if (consol0.contains(substring1) == true){
                consol0=consol0.substring(1);
                consol0=consol0.substring(1);
                consol0=consol0.substring(1);

                String cifra1 = consol0;

                if (Integer.parseInt(cifra1) > 10){
                    System.out.println("Тз - значене не более 10 включительно.");
                    System.exit(0);
                }

                String result = cifra0.repeat(Integer.parseInt(cifra1));

                //проверка 40 символов в ответ

                int count = 0;
                for(int i = 0; i<result.length(); i++) {
                    count++;
                }

                if (count > 40 ){
                    String resultbukvaymnoj = result.substring(0,40); //присваиваем c 0 по 40 символ
                    System.out.println(resultbukvaymnoj+"...");
                    System.exit(0);
                }
                System.out.println("\"" + result + "\"");
                System.exit(0);
            }

            String substring2 = "/";
            if (consol0.contains(substring2) == true){
                consol0=consol0.substring(1);
                consol0=consol0.substring(1);
                consol0=consol0.substring(1);

                String cifra1 = consol0;

                if (Integer.parseInt(cifra1) > 10){
                    System.out.println("Тз - значене не более 10 включительно.");
                    System.exit(0);
                }

                int count = 0;
                for(int i = 0; i<cifra0.length(); i++) {
                    count++;
                }
                int result = (count / Integer.parseInt(cifra1));

                String resultbukva = cifra0.substring(0,result);


                System.out.println("\"" + resultbukva + "\"");


                System.exit(0);
            }

            System.out.println("ошибка");
            System.exit(0);

        }
        System.out.println("ошибка");
        System.exit(0);
    }
}





//============= хлам





   /*  if (znak.equals("+")) {
            String result = cifra0 + cifra1;
            System.out.println("\""+result+"\"");
        }*/


       /* if (znak.equals("+")){
            cifra0 = cifra0.replace('"', ' ');
            cifra1 = cifra1.replace('"', ' ');
            cifra0 = cifra0.trim();
            cifra1 = cifra1.trim();
            String result = cifra0 + cifra1;
            System.out.println("\""+result+"\"");
        }*/











//=============
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//args = br.readLine().split(" "); //Загоняем текст с консоли в массив
/*     String str = "I love Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

*/
/*  Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.nextLine();
        System.out.print(num);
*/
// String cifra0 = args[0];   //присвоил переменной цыфра строку AGRS1
//String cifra1 = args[2];
//String znak = args[1];


// int start = cifra0.indexOf( '\"' ) + 1, end = cifra0.indexOf( '\"', start );


// if (znak.equals("-")) {
 /* cifra0 = cifra0.replace('"', ' ');
            cifra1 = cifra1.replace('"', ' ');
            cifra0 = cifra0.trim();
            cifra1 = cifra1.trim();
            String result1 = cifra0.replace(cifra1, "");
            System.out.println(result1);*/