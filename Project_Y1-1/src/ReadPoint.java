import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadPoint implements Points{
	
	ArrayList<Double> POINT_X = new ArrayList<Double>();
	ArrayList<Double> POINT_Y = new ArrayList<Double>();
	
	public ReadPoint(ArrayList<Double> POINT_X, ArrayList<Double> POINT_Y){
		this.POINT_X = POINT_X;
		this.POINT_Y = POINT_Y;
	}
	
	public ArrayList<Double> get_X(){
		return POINT_X;
	}
	
	public ArrayList<Double> get_Y(){
		return POINT_Y;
	}
	
	public void add_Point(){
		//Points.add(new Point(this.POINT_X, this.POINT_Y));
	}
	
	public void readpoint(){
		String[] temp = new String[1000];
 		int i = 0;
 		double[] a = new double[1000];
 		double[] b = new double[1000];

 		String str;
   		try{
   			FileReader fr = new FileReader("input.txt");
   			BufferedReader bfr = new BufferedReader(fr);
   			do{
       			str = bfr.readLine().replace("(","").replace(")","");
       				if(str  ==  null){
       					bfr.close();
       					fr.close();
       					break;
       				}   
       			temp = str.split(","); 
       			
       				a[i] = Double.parseDouble(temp[i]);
       				POINT_X.add(a[i]);
       				b[i] = Double.parseDouble(temp[i+1]);
       				POINT_Y.add(b[i]);
       			}while(true);
   			 i++;
   		}
   		catch(IOException | NumberFormatException | ArrayIndexOutOfBoundsException 
   				| NullPointerException e){}
	}
}
