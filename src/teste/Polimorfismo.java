package teste;

	class Animal {
	     public void comer() {
	          System.out.println( "Animal Comendo..." );
	     }
	}
	class Cao  extends Animal {
	     public void comer() {
	          System.out.println( "Cão Comendo..." );
	     }
	}
	class Tigre extends Animal {
	     public void comer() {
	          System.out.println( "Tigre Comendo..." );
	          super.comer();
	     }
	}
	
	public class Polimorfismo {
		  public void fazerAnimalComer( Animal animal ) {
		       animal.comer();
		  }
		  
		  public static void main( String[] args ) {
			  Polimorfismo t = new Polimorfismo();
		     //   t.fazerAnimalComer( new Animal() );
		      //  t.fazerAnimalComer( new Cao() );
		      //  t.fazerAnimalComer( new Tigre() );
		        Animal tigre = new Animal();
		       // Animal a = new Tigre();
		        //Tigre ani2 =  (Tigre) tigre;
		       // ani2.comer();
		        Object a = new Tigre();
		        Tigre b;
		        b = (Tigre) a;
		        b.comer();
		       // ani2.comer();
		   }
	}