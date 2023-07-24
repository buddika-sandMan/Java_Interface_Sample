//class Lion<T>{
//    public String details="Lion details";
//}
//
//class Fish<T>{
//    public String details="Fish details";
//}
//
//class PrintInfo<T>{
//    String data;
//
//    PrintInfo(T data){
//        this.data=data.details;
//    }
//
//    void printData(){
//        System.out.println(data);
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//
//        PrintInfo<Lion> printInfo = new PrintInfo<>(Lion);
//        printInfo.printData();
//
//    }
//}

class MG4 implements Gun{
    public void fire(){
        System.out.println("Shoot MG4");
    }
}

class Uzi implements Gun{
    public void fire(){
        System.out.println("Shoot Uzi");
    }
}

class Soilder{
    void shoot(Gun gun){
        gun.fire();
    }
}

interface Gun{
    public void fire();
}

class Demo{
    public static void main(String[] args) {
        Soilder soilder = new Soilder();
        Gun mg4 = new MG4();
        Gun uzi = new Uzi();

        soilder.shoot(mg4);
        soilder.shoot(uzi);
    }
}