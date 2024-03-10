package tuan5;
import jdepend.xmlui.JDepend;
import java.io.PrintWriter;
public class Main {
	
	
	 public static void main(String[] args) throws Exception{
	 JDepend depend =new JDepend(new PrintWriter("reports/report.xml"));
	 depend.addDirectory("C:\\KienTrucThucHanh_tuan5\\Library-Assistant");
	 depend.analyze();
	 System.out.println("DONE");
	 }
	
}
