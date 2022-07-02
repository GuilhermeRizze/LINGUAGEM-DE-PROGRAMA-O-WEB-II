<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitacao</title>
    </head>
    <body>
        <h1>Disponibilidade de Androids</h1>
        <hr/>
    <%
    try {
	com.service.android.VerificarAndroidService service = new com.service.android.VerificarAndroidService();
	com.service.android.VerificarAndroid port = service.getVerificarAndroidPort();
	 // TODO initialize WS operation arguments here
	java.lang.String digital = "87546";
	java.lang.String modelo = "RK800";
	// TODO process result here
	boolean result = port.checarandroid(digital, modelo);
	out.println("Resultado verificação Android = " + result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
        <hr/>

    </body>
</html>
