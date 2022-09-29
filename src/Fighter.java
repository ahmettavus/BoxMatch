public class Fighter {
    //Fighter defined the name,damage like that qualifications
    String name;
    int damage;
    int health;
    int weight;

    int dodge;


    Fighter (String name, int damage, int health,int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (dodge >= 0 && dodge <=100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }



    }
    int hit(Fighter karsit){
        System.out.println(this.name + " => " + karsit.name +" " + this.damage + "  hasar vurdu" );

        if (karsit.isDodge()){
            System.out.println(karsit.name + "  The dodge is blocked");
            return karsit.health;
        }
        if (karsit.health - this.damage < 0){
            return 0;
        }
        return karsit.health - this.damage;

    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }
}
 