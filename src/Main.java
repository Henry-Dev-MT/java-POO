public class Main{
    public static void main(String[] args){


        Computador comp = new Computador("Notebook", "Asus", 2019, 32,"" );
        Periferico perif = new Periferico("Mouse gamer", "Redragon", 2020, "", "");

        System.out.println("==========Apresentação==========");
        comp.apresentarEquip();
        perif.apresentarEquip();
        System.out.println("=================================");

    }
}
