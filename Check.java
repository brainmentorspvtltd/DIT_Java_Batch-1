

	import java.io.*;  
	class Check {  
	 public static void main(String arg[]) {  
	  File inf = new File("in.txt");  
	  File outf = new File("out.txt");  
	  FileReader ins = null;  
	  FileWriter outs = null;  
	  try {  
	   ins = new FileReader(inf);  
	   outs = new FileWriter(outf);  
	   int ch;  
	   while ((ch = ins.read()) != -1) {  
	    outs.write(ch);  
	   }  
	  } catch (IOException e) {  
	   System.out.println(e);  
	   System.exit(-1);  
	  } finally {  
	   try {  
	    ins.close();  
	    outs.close();  
	   } catch (IOException e) {}  
	  }  
	 }  
	}  






