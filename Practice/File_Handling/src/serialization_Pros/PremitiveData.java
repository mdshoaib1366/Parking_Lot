package serialization_Pros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PremitiveData {
	public static void main(String[] args) throws IOException {
		var fout = new FileOutputStream("c:\\new\\primitive.txt");
		var dos = new DataOutputStream(fout);
		
		try(fout;dos)
		{
			dos.writeBoolean(false);
			dos.writeChar('A');
			dos.writeByte(Byte.MAX_VALUE);
			dos.writeShort(Short.MAX_VALUE);
			dos.writeInt(Integer.MAX_VALUE);
			dos.writeFloat(Float.MAX_VALUE);
			dos.writeDouble(Math.PI);
			dos.writeBytes("Hello India...");
			dos.flush();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Reading the primitive data from the file...");
		
		var fin = new FileInputStream("c:\\new\\primitive.txt");
		var dis = new DataInputStream(fin);
		try(fin;dis)
		{
			boolean b = dis.readBoolean();
			char c = dis.readChar();
			byte bt = dis.readByte();
			short s = dis.readShort();
			int i = dis.readInt();
			float f = dis.readFloat();
			double d = dis.readDouble();
			String x=  dis.readLine();
			
			System.out.println(b+"\n"+c+"\n"+bt+"\n"+s+"\n"+i+"\n"+f+"\n"+d+"\n"+x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
