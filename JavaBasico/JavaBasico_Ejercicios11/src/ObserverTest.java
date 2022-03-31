import java.util.ArrayList;


    interface Mensajero {
        void hanSaludado();
    }

    class Receptor implements Mensajero{

        @Override
        public void hanSaludado() {
            System.out.println("hola");
        }
    }

    class Emisor {

        private ArrayList<Mensajero> receptores = new ArrayList<>();

        public void meteReceptores (Mensajero receptor){

            receptores.add(receptor);
        }

        public void saluda(){

            for(Mensajero ml : receptores){

                ml.hanSaludado();
            }

        }

    }


    public class ObserverTest {

        public static void main(String[] args) {


            Emisor emisor = new Emisor();
            Receptor receptor = new Receptor();

            emisor.meteReceptores(receptor);
            emisor.saluda();
        }
    }








