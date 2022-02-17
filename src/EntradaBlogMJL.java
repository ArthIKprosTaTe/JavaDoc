
/*<h2>Clase para manejar las entradas de un blog.</h2>
 * @Author Mario Jover 17/02/2022.
 * @version 2.4
 * @Since 2.3
 */

public class EntradaBlogMJL {

	
		/*<i> separador es el ccarácter que separa ENTRADA DE del nombre del autor</i>
		*/
		public static char separador=':';
		/* <i>id es el numero de la entrada</i>
		*/
		private int id;
		/* <i>id texto es el mensaje</i>
		*/
		private String texto;
		/* <i>autor es es que escribio el mensaje</i>
		*/
		private String autor;
		
		/*<h2>Constructor de la clase.</h2>
		 * @throws si recibe un número negativo, arroja una excepción.
		 * 
		 */
		EntradaBlogMJL(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/* <h2>Devuelve numero de la entrada</h2>
		*/
		public int getId(){
			return this.id;
		}
		
		/* <h2>Devuelve el texto completo de la entrada</h2>
		*/
		public String getTexto(){
			return this.texto;
		}
		
		/* <h2>Devuelve el nombre del autor de la entrada en mayusculas</h2>
		*/
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/*<h2>Devuelve el nombre del autor.</h2>
		 * @deprecated  
		 * @See getAutor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
		/*<h2>No tiene que tener argumentos</h2>
		 * 
		 */
		public static void main(String[] args) {
			EntradaBlogMJL e1=new EntradaBlogMJL (3," Ana", "Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}

}
