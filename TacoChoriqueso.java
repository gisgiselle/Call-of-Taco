public class TacoChoriqueso extends Taco{
     
    public TacoPastor(){
        super("Pastor", 100,20,20,8);
        AtaqueEspecial[] especial=new AtaqueEspecial[4];
        especiales[0]=new AtaqueEspecial("Choricombo",40);
        especiales[1]=new AtaqueEspecial("Látigo de Queso",20);
        especiales[2]=new AtaqueEspecial("Lluvia de Chorizo",25);
        especiales[3]=new AtaqueEspecial("Agrasador",20);

        super.setAtaqueEspecial(especiales);
    }
    

   public void atack(Personaje enemigo){
   	System.out.println("Ataque de Tlaxcalli Pastor");
   	enemigo.setHp(enemgigo.getHp()-(getAtaque()-enemigo.getDefensa()));
   }

}