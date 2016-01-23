package reader;

public class Reader  {
	public static String readQr() throws Exception{
		new WebcamQRCode();
		String data = WebCam.init();
		return(data);	
	}
}
