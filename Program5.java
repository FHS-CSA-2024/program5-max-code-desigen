

//import stuff here?

//Your code here

public class Program5 {
    public static void main (String[] args){
        
        
        
        int royaleMiles = 286;
        int royaleGallons = 9;

        int koopaKingMiles = 412;
        int koopaKingGallons = 40;

        int pipeFrameMiles = 361;
        int pipeFrameGallons = 18;

        int badwagonMiles = 161;
        int badwagonGallons = 11;

        
        double royaleMPG = (double) royaleMiles / royaleGallons;
        double koopaKingMPG = (double) koopaKingMiles / koopaKingGallons;
        double pipeFrameMPG = (double) pipeFrameMiles / pipeFrameGallons;
        double badwagonMPG = (double) badwagonMiles / badwagonGallons;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println("Royale averaged " + Math.round(royaleMPG * 10) / 10.0 + " m/g");
        System.out.println("Koopa King averaged " + Math.round(koopaKingMPG * 10) / 10.0 + " m/g");
        System.out.println("Pipe Frame averaged " + Math.round(pipeFrameMPG * 10) / 10.0 + " m/g");
        System.out.println("Badwagon averaged " + Math.round(badwagonMPG * 10) / 10.0 + " m/g");
           
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 m/g
Koopa King averaged 10.3 m/g
Pipe Frame averaged 20.1 m/g
Badwagon averaged 14.6 m/g


*/
