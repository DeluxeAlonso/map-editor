package view;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;
/**
*
* @author JOSECARLOS
*/
public class ImageRepository {
    private static final HashMap<String,BufferedImage> repo = new HashMap();
    public ImageRepository(){
        BufferedImage plain = this.loadImage("resources/plain.png") ;
        BufferedImage grass = this.loadImage("resources/grass.png") ;
        BufferedImage armory = this.loadImage("resources/armory.png") ;
        BufferedImage castle = this.loadImage("resources/castilo1.gif") ;
        BufferedImage house = this.loadImage("resources/house1.gif") ;
        BufferedImage doctor = this.loadImage("resources/doctor.gif") ;
        BufferedImage horserider = this.loadImage("resources/horserider.png") ;
        BufferedImage villager = this.loadImage("resources/villager2.gif") ;
        BufferedImage arquero=this.loadImage("resources/arquero.gif");

        BufferedImage houseP=this.loadImage("resources/house1.gif");
        BufferedImage villagerP = this.loadImage("resources/villager1.gif") ;
        BufferedImage arqueroP=this.loadImage("resources/arquero1.gif");
        BufferedImage doctorP=this.loadImage("resources/doctor1.gif");
        BufferedImage castleP=this.loadImage("resources/castilo1.gif");
        repo.put("Plain",plain);
        repo.put("Grass",grass);
        repo.put("Armery",armory);
        repo.put("Castle",castle);
        repo.put("House",house);
        repo.put("Doctor",doctor);
        repo.put("HorseRider",horserider);
        repo.put("Villager",villager);
        repo.put("HouseP",houseP);
        repo.put("VillagerP",villagerP);
        repo.put("ArqueroP",arqueroP);
        repo.put("Archer",arquero);
        repo.put("DoctorP",doctorP);
        repo.put("CastleP",castleP);
    }
    public BufferedImage getImage(String name){
        BufferedImage img = (BufferedImage)repo.get(name);
        return img;
    }
    private BufferedImage loadImage(String fileName){
        URL url = null;
        url = this.getClass().getClassLoader().getResource(fileName);
        try { 
        return ImageIO.read(url);
        } catch (IOException e) {
        System.err.println("No se pudo carga la imagen " + fileName + " de " + url);
        System.err.println("El error fue: " + e.getClass().getName() + " " + e.getMessage());
        System.exit(0);
        return null;
        }
    }
}