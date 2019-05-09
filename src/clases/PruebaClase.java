package clases;

class PruebaClase {
    public static void main(String[] args){
        //create objects
        Pokemon pk1 = new Pokemon(); //instantiated
        Pokemon pk2 = new Pokemon();

        //set attributes
        pk1.name = "Charmander";
        pk1.type = "Fire";
        pk1.lvl = 3;

        pk2.name = "Bulbasaur";
        pk2.type = "Grass";
        pk2.lvl = 6;

        System.out.println(pk1);
        System.out.println(pk2);
    }
}



