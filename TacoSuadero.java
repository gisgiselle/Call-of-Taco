
public class TacoSuadero extends Taco{
    public TacoSuadero(){
        super("Suadero", 100,5,15,25);
        AtaqueEspecial[] especial=new AtaqueEspecial[4];
        especiales[0]=new AtaqueEspecial("Carne de dudosa procedencia",40);
        especiales[1]=new AtaqueEspecial("tomatazo",30);
        especiales[2]=new AtaqueEspecial("",25);
        especiales[3]=new AtaqueEspecial("Aceite hirviendo",20);

        super.setAtaqueEspecial(especiales);
    }
    

   public void atack(Personaje enemigo){
   	System.out.println("Ataque de Tlaxcalli Pastor");
   	enemigo.setHp(enemgigo.getHp()-(getAtaque()-enemigo.getDefensa()));
   }
 }
   
