public abstract class Taco extends Personaje{
	
	private AtaqueEspecial[] especiales ;
	private Condimentos[] morral;
	String nombre=Tlaxcalli;


	public Taco(int hp, int energia, int defensa, int ataque){
		super(hp, energia, defensa, ataque);
		morral= new Condimento[10];
	}
	

	public AtaqueEspecial[] getespeciales()){
		return habilidades;
	}

	public void setAtaqueEspecial(AtaqueEspecial[] especiales){
		this.habilidades=habilidades;
	}

	public Condimento[] getMorral(){
		return morral;
	}

	public void addCondimentotoMorral(int index){
		morral[index]=null;
	}

	public String dameInventario(){
		String resultado="Mochila: [";
		for(int i=0; i<morral.length; i++){
			if(morral[i]!=null){
				resultado=resultado+" Condimento: "+morral[i].getNombre()+" puntos: "+morral[i].getPuntos()+",";
			}
			else{
				resultado=resultado+"Vacío, ";
			}
		}

		resultado=resultado+"]";
		return resultado;
	}


	public String verMiAtaqueEspecial(){
		String resultado="Ataques Especiales: [";
		for(int i=0;i<especiales.length;i++){

			resultado= resultado+" Ataque Especial: "
				+especiales[i].getNombre()
				+" puntos: "+ especiales[i].getPuntosEspeciales()+",";				

		}
		resultado= resultado+"]";
		return resultado;
	}
	public void atacar(Personaje enemigo, AtaqueEspecial especiales){
		enemigo.setHp(enemigo.getHp()-(especiales.getPuntosEspeciales()-enemigo.getDefensa()));
	}
	public void atacar(Personaje enemigo, Condimento condimento){
		enemigo.setHp(enemigo.getHp()-(condimento.getPuntos()-enemigo.getDefensa()));
	}
}

