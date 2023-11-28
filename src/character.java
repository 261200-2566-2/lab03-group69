public class character {
    private String name;
    private int Level = 1 ;
    private int MaxLevel = 200;
    private double Hp =100;
    private double Mana=100;
    private double BaseSpeed = 10;
    private double SwordDamage=10;
    private double ShieldDefense=10;
    private double attacked;
    public character(String name) {
        this.name = name;
    }
    private double MaxinumHp(){
        return (this.Hp=this.Hp+(10*Level));
    }
    private double MaxinumMana(){
        return (this.Mana=this.Mana+(10*Level));
    }
    private double Maxinumrunspeed(){
        return (this.BaseSpeed=this.BaseSpeed+(0.3*Level));
    }
    private double SwordDamage(){
        return this.SwordDamage=this.SwordDamage+(0.2*Level);
    }
    private double ShieldDefend(){
        return this.ShieldDefense=this.ShieldDefense+(0.2*Level);
    }
    private double SwordRunSpeedDecrease(){
        return this.BaseSpeed=BaseSpeed+(0.1+0.04*Level);
    }
    private double ShieldRunSpeedDecrease(){
        return this.BaseSpeed=BaseSpeed+(0.1+0.04*Level);
    }
    public void ShowStat(){ //show all status of character
        System.out.println("Name : "+ name);
        System.out.println("Level : "+ Level);
        System.out.println("HP : "+ Hp);
        System.out.println("Mana : " + Mana);
        System.out.println("BaseSpeed : "+BaseSpeed);
        System.out.println("SwordDamage : "+SwordDamage);
        System.out.println("Shield : "+ShieldDefense);
        System.out.println("-------------------------------");
    }
    public void Levelup()
    {
        if(this.Level<MaxLevel)
        {
            Level++;
            MaxinumHp();
            MaxinumMana();
            Maxinumrunspeed();
            SwordDamage();
            ShieldDefend();
            SwordRunSpeedDecrease();
            ShieldRunSpeedDecrease();
        }
        else
        {
            System.out.println("Your level has reached the maximum.");
        }
    }
    public double Attacked (double attacked)
    {
        if(attacked>=0)
        {
            if(attacked>=ShieldDefense)
            {
                attacked = attacked - ShieldDefense;
                Hp = Hp -attacked;
            }
            else if(attacked<=ShieldDefense)
            {
                attacked = 0;
            }
        }
        else
        {
            System.out.println("Attack value must be a positive integer");
        }
        return Hp;
    }
}