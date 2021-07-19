import java.util.Scanner;
public class Exercise1 {

	static String cad;
	public static void main(String[] args) {
		new Exercise1().load();
	}
	private void proceso(String linea){
		try{
			String cad[]=linea.split(" ");
			//System.out.println("numero="+cad[0]+" base="+cad[1]);
			System.out.println(Integer.parseInt(cad[0],Integer.parseInt(cad[1])));
		}catch(Exception e){
			System.out.println("ERROR");
		}
	}
	private void load(){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			proceso(sc.nextLine());
		}
	}
}
//atributos de clase y instancia
//miembro estatico  se puede acceder a travez de la clase no necesita instancia
//stringtokenizer y split
//separar cadenas por tokens