package tuan5;

import jdepend.swingui.JDepend;
public class Swing_UI_Main {
 public static void main(String[] args) throws Exception{
 JDepend depend =new JDepend();
 depend.addDirectory("C:\\KienTrucThucHanh_tuan5\\Library-Assistant");
 depend.analyze();
 System.out.println("DONE");
 }
}
