public class TacoPastor extends Taco{
    
    public TacoPastor(){
        super("Pastor", 100,20,5,15);
        AtaqueEspecial[] especial=new AtaqueEspecial[4];
        especiales[0]=new AtaqueEspecial("Carnazo",35);
        especiales[1]=new AtaqueEspecial("Lanzar guajillo en los ojos",30);
        especiales[2]=new AtaqueEspecial("Cachetada de Tortilla",25);
        especiales[3]=new AtaqueEspecial("Aceite hirviendo",20);

        super.setAtaqueEspecial(especiales);
    }
    

   public void atack(Personaje enemigo){
   	System.out.println("Ataque de Tlaxcalli Pastor");
   	enemigo.setHp(enemgigo.getHp()-(getAtaque()-enemigo.getDefensa()));
   }

}