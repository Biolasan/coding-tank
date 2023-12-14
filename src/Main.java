import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {


    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Rex", "Marrom", 25, 5.5, 5, "nada");

        Gato gato1 = new Gato("Felix", "Preto", 4.5);

        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


        // AULA DE ATALHOS //

        int inteiro; //int, long, byte = 0;
        float $$; //double e float = 0.0;
        boolean $87; //boolean tem como default false;
        char ch; // char é vazio;
        String teste; // valor default de qualquer objeto é null;

        double d = 5.5d;
        float f = 3.00f;

        float x = f + (float) d;
        System.out.println(x);

        int a = 23_456_789;
    }
}

//        Petshop petshop = new Petshop();
//
//        petshop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//
//        petshop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petshop.tosar(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());



//    }
//}

//        cachorro1.soar();
//        gato1.soar();
//        passaro1.soar();
//    }
//}

//        System.out.println(cachorro1.getNumeroDeCachorros());
//
//        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");
//
//        System.out.println(cachorro2.getNumeroDeCachorros());
//        System.out.println(cachorro1.getNumeroDeCachorros());

//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());

//        cachorro2 = cachorro1;

//        System.out.println("------------------");
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());

//    }
//}

//        cachorro1.setNome("Puppy");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);

//        cachorro1.latir();
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

//        System.out.println(cachorro2.getNome());
//        System.out.println(cachorro2.getPeso());
//
//
//        System.out.println("O cachorro está " + cachorro1.interagir("Carinho"));
//        System.out.println("O cachorro está " + cachorro1.interagir("Nada"));
//        System.out.println("O cachorro está " + cachorro1.interagir("Vai dormir!"));
//
//
//    }
//}