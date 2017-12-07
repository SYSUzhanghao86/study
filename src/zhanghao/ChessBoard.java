package zhanghao;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessBoard extends JPanel{

	ChessPieces chessPieces;
    //�������̴�С
    private static int Borad_WidthSize=9;
    private static int Borad_HigthSize=10;
    //������������
    private final int Table_Width=555;
    private final int Table_Hight=618;
    //����С
    //private final int Chess_Width=456;
    //private final int Chess_Hight=515;
    //�����С
    private final int Box_Width=57;
    private final int Box_Hight=57;
    //����������������ֵ����������ı���
    //private final int Xrate=Chess_Width/Borad_WidthSize;
    //private final int Yrate=Chess_Hight/Borad_HigthSize;
    //�����������������ֵ����������֮���ƫ�ƾ���
    private final int X_offset=25;
    private final int Y_offset=25;
    
    public void init() throws IOException{
    	chessPieces=new ChessPieces();
    	//��Ϸ����
        JFrame f=new JFrame("�й�����");
        
    	//������С
    	this.setPreferredSize(new Dimension(Table_Width,Table_Hight));
    	//�������̺�����
    	this.repaint();
    	f.add(this);
    	f.pack();
    	f.setVisible(true);
    }
    public void paint(Graphics g){
    	//����
    	g.drawImage(chessPieces.getTable(), 0, 0, null);
				
    	//���ƺڷ�����
    	g.drawImage(chessPieces.getBlackcar(), 0*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackhorse(), 1*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackelephant(), 2*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackofficia(), 3*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//ʿ
    	g.drawImage(chessPieces.getBlackgenera(), 4*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackofficia(), 5*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//ʿ
    	g.drawImage(chessPieces.getBlackelephant(), 6*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackhorse(), 7*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackcar(), 8*Box_Width+X_offset, 0*Box_Hight+Y_offset, null);//��	
    	g.drawImage(chessPieces.getBlackcannon(), 1*Box_Width+X_offset, 2*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlackcannon(), 7*Box_Width+X_offset, 2*Box_Hight+Y_offset, null);//��	
    	g.drawImage(chessPieces.getBlacksoldier(), 0*Box_Width+X_offset, 3*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlacksoldier(), 2*Box_Width+X_offset, 3*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlacksoldier(), 4*Box_Width+X_offset, 3*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlacksoldier(), 6*Box_Width+X_offset, 3*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getBlacksoldier(), 8*Box_Width+X_offset, 3*Box_Hight+Y_offset, null);//��
    	    		
    	//���ƺ췽����
        g.drawImage(chessPieces.getRedcar(), 0*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedhorse(), 1*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedelephant(), 2*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedofficia(), 3*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//ʿ
    	g.drawImage(chessPieces.getRedgenera(), 4*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedofficia(), 5*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//ʿ
    	g.drawImage(chessPieces.getRedelephant(), 6*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedhorse(), 7*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedcar(), 8*Box_Width+X_offset, 9*Box_Hight+Y_offset, null);//��	
    	g.drawImage(chessPieces.getRedcannon(), 1*Box_Width+X_offset, 7*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedcannon(), 7*Box_Width+X_offset, 7*Box_Hight+Y_offset, null);//��	
    	g.drawImage(chessPieces.getRedsoldier(), 0*Box_Width+X_offset, 6*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedsoldier(), 2*Box_Width+X_offset, 6*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedsoldier(), 4*Box_Width+X_offset, 6*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedsoldier(), 6*Box_Width+X_offset, 6*Box_Hight+Y_offset, null);//��
    	g.drawImage(chessPieces.getRedsoldier(), 8*Box_Width+X_offset, 6*Box_Hight+Y_offset, null);//��
    	
     }
}

