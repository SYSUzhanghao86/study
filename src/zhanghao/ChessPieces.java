package zhanghao;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ChessPieces {
	//����
    private BufferedImage table;
	//����
	private BufferedImage blackcar,blackhorse,blackelephant,blackgenera,blackofficia,blackcannon,blacksoldier;
	//����
	private BufferedImage redcar,redhorse,redelephant,redgenera,redofficia,redcannon,redsoldier;
	
	public ChessPieces() throws IOException {
		super();
		this.table = ImageIO.read(new File("image/main.gif"));
		this.blackcar = ImageIO.read(new File("image/�ڳ�.gif"));
		this.blackhorse = ImageIO.read(new File("image/����.gif"));
		this.blackelephant = ImageIO.read(new File("image/����.gif"));
		this.blackgenera = ImageIO.read(new File("image/�ڽ�.gif"));
		this.blackofficia =ImageIO.read(new File("image/��ʿ.gif"));
		this.blackcannon = ImageIO.read(new File("image/����.gif"));
		this.blacksoldier = ImageIO.read(new File("image/����.gif"));
		this.redcar =ImageIO.read(new File("image/�쳵.gif"));
		this.redhorse = ImageIO.read(new File("image/����.gif"));
		this.redelephant = ImageIO.read(new File("image/����.gif"));
		this.redgenera = ImageIO.read(new File("image/�콫.gif"));
		this.redofficia = ImageIO.read(new File("image/��ʿ.gif"));
		this.redcannon = ImageIO.read(new File("image/����.gif"));
		this.redsoldier =ImageIO.read(new File("image/����.gif"));
	}
	//����
	public BufferedImage getTable() {
		return table;
	}



	public void setTable(BufferedImage table) {
		this.table = table;
	}



	public BufferedImage getBlackcar() {
		return blackcar;
	}



	public void setBlackcar(BufferedImage blackcar) {
		this.blackcar = blackcar;
	}



	public BufferedImage getBlackhorse() {
		return blackhorse;
	}



	public void setBlackhorse(BufferedImage blackhorse) {
		this.blackhorse = blackhorse;
	}



	public BufferedImage getBlackelephant() {
		return blackelephant;
	}



	public void setBlackelephant(BufferedImage blackelephant) {
		this.blackelephant = blackelephant;
	}



	public BufferedImage getBlackgenera() {
		return blackgenera;
	}



	public void setBlackgenera(BufferedImage blackgenera) {
		this.blackgenera = blackgenera;
	}



	public BufferedImage getBlackofficia() {
		return blackofficia;
	}



	public void setBlackofficia(BufferedImage blackofficia) {
		this.blackofficia = blackofficia;
	}



	public BufferedImage getBlackcannon() {
		return blackcannon;
	}



	public void setBlackcannon(BufferedImage blackcannon) {
		this.blackcannon = blackcannon;
	}



	public BufferedImage getBlacksoldier() {
		return blacksoldier;
	}



	public void setBlacksoldier(BufferedImage blacksoldier) {
		this.blacksoldier = blacksoldier;
	}



	public BufferedImage getRedcar() {
		return redcar;
	}



	public void setRedcar(BufferedImage redcar) {
		this.redcar = redcar;
	}



	public BufferedImage getRedhorse() {
		return redhorse;
	}



	public void setRedhorse(BufferedImage redhorse) {
		this.redhorse = redhorse;
	}



	public BufferedImage getRedelephant() {
		return redelephant;
	}



	public void setRedelephant(BufferedImage redelephant) {
		this.redelephant = redelephant;
	}



	public BufferedImage getRedgenera() {
		return redgenera;
	}



	public void setRedgenera(BufferedImage redgenera) {
		this.redgenera = redgenera;
	}



	public BufferedImage getRedofficia() {
		return redofficia;
	}



	public void setRedofficia(BufferedImage redofficia) {
		this.redofficia = redofficia;
	}



	public BufferedImage getRedcannon() {
		return redcannon;
	}



	public void setRedcannon(BufferedImage redcannon) {
		this.redcannon = redcannon;
	}



	public BufferedImage getRedsoldier() {
		return redsoldier;
	}



	public void setRedsoldier(BufferedImage redsoldier) {
		this.redsoldier = redsoldier;
	}
	
	
}
