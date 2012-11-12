package net.tihz.core.servlet;

import java.io.PrintWriter;

public class CoreService {

	public void write(PrintWriter pw)  {
		pw.append("CoreService call :\tok\n");
		if (pw != null) {
			pw.append("CoreService write:\tok\n");
		}
	}
}
