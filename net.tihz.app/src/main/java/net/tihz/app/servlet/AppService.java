package net.tihz.app.servlet;

import java.io.PrintWriter;

public class AppService {

	public void write(PrintWriter pw)  {
		pw.append("AppService call :\tok\n");
		if (pw != null) {
			pw.append("AppService write:\tok\n");
		}
	}
}
