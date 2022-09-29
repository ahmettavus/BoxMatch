public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;

        this.maxWeight = maxWeight;
        this.minWeight = minWeight;


    }

    // defined the run methot

    void run(){
        if (isCheck()){
            // dovusculerin sagliklari 0 dan buyuk oldugu surece dongumuz hep calissin diye bu kodu yazdik
            while (this.f1.health > 0 && this.f2.health > 0){

                System.out.println("======== New Round ========");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }

                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Health : " + this.f1.health );
                System.out.println(this.f2.name + " Health : " + this.f2.health );

            }

        } else {
            System.out.println("The fighter shkylets are not matched!");
        }
    }

    Fighter f1(){
        double r = Math.random()*100;
        return r<=50 ? f1:f2;
    }
        //isCheck methodu tanimlayarak dovusculerin min ve max agirlik deger araliginda olmalari istenildi!
    boolean isCheck (){
        return (this.f1.weight >=minWeight && this.f1.weight <=maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <=maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(f2.name + "  kazandi !");
            return  true;

        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + "  kazandi ");
            return true;
        }

        return false;
    }
}
