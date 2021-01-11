package org.ovelychko;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/*
@WebServlet(
        name = "RequestLogging",
        description = "Requests: Logging example",
        urlPatterns = "/requests/log"
)*/
public class addition extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter pw = resp.getWriter();

        int a, b, c;

        String param_a = req.getParameter("a");
        if (param_a == null || param_a.isEmpty()) {
            pw.println("error: A is empty:" + param_a);
            return;
        }

        String param_b = req.getParameter("b");
        if (param_b == null || param_b.isEmpty()) {
            pw.println("error: B is empty:" + param_b);
            return;
        }

        try {
            a = Integer.parseInt(param_a);
            b = Integer.parseInt(param_b);
        }
        catch (NumberFormatException e) {
            pw.println("error: parameter parse :" + param_a + " / " + param_b);
            return;
        }

        c = a + b;
        pw.println(c);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter pw = resp.getWriter();

        int a, b, c;

        String param_a = req.getParameter("a");
        if (param_a == null || param_a.isEmpty()) {
            pw.println("error: A is empty:" + param_a);
            return;
        }

        String param_b = req.getParameter("b");
        if (param_b == null || param_b.isEmpty()) {
            pw.println("error: A is empty:" + param_b);
            return;
        }

        try {
            a = Integer.parseInt(param_a);
            b = Integer.parseInt(param_b);
        }
        catch (NumberFormatException e) {
            pw.println("error: parameter parse :" + param_a + " / " + param_b);
            return;
        }

        c = a + b;
        pw.println(c);
    }
}