package MyPractices.replit;

import java.util.ArrayList;
import java.util.List;

public class List_elemanyerdegistirme {
    //Create a 10-element list. Swap the 8th element with the 3rd element.
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Umit");
        names.add("Emin");
        names.add("Kemal");
        names.add("Kerem");
        names.add("Taylan");
        names.add("Orhan");
        names.add("Sinan");
        names.add("Furkan");
        names.add("Ahmet");
        names.add("Ali");

        String s = names.remove(2);
        names.set(2, names.get(6));
        names.set(6, s);
        System.out.println(names);

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Fatma");
        list.add("Ayse");
        list.add("Ahmet");
        list.add("Omer");
        list.add("Yunus");
        list.add("Ibrahim");
        list.add("Veli");
        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            if (!(list.get(i).contains("a") || (list.get(i).contains("A")))){
               yeniList.add(list.get(i));
            }
        }
        System.out.println(yeniList);

        /*Write a program to find the common elements between two String Arrays (without case sensitivity)
        Input1 : {John,Brad,Ange,Sofia,Emily}  Input2 : {sofia,brad,grace,emily,hazel}*/

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new ArrayList<>();
        names1.add("John");
        names1.add("Brad");
        names1.add("Ange");
        names1.add("Sofia");
        names1.add("Emily");

        names2.add("sofia");
        names2.add("brad");
        names2.add("grace");
        names2.add("emily");
        names2.add("hazel");
        String str = "";
        for(String w:names1){
            for(String k:names2){
                if(w.equalsIgnoreCase(k)){
                    str += w+" ";
                }
            }
        }
        System.out.println(str);

        }

    }
