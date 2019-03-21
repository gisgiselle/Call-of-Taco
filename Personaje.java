public class Personaje{

	private int Hp;
	private String Nombre;
	private int Ataque;
	private int Defensa;

	public Personaje(String nombre, int hp,int energia,int ataque,int defensa){
		this.nombre=nombre;
		this.hp=hp;
		this.ataque=ataque;
		this.defensa=defensa;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setHp(int hp){
		this.hp=hp;
	}

	public int getHp(){
		return hp;
	}

	public void setAtaque(int ataque){
		this.ataque=ataque;
	}

	public int getAtaque(){
		return ataque;
	}

	public void setDefensa(int defensa){
		this.defensa=defensa;
	}

	public void atacar(Personaje malo){

	}

	public void defender(Personaje m){
		
	}

}
